package com.yunfei;

import com.yunfei.entity.*;
import com.yunfei.mapper.ExcelMapper;
import com.yunfei.mapper.ProvincesMapper;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * @description:
 * @author:
 * @date: 2019-12-19 17:09
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = { ExcelDownLoadApplication.class }) // 指定启动类
public class ExcelTest {

    @Autowired
    private ExcelMapper excelMapper;
    @Autowired
    private ProvincesMapper provincesMapper;

    @Test
    public void home() throws IOException {

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFCellStyle style = workbook.createCellStyle();
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);

        //字体样式
        HSSFFont font2 = workbook.createFont();
        font2.setFontName("仿宋_GB2312");
        font2.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);//粗体显示
        font2.setFontHeightInPoints((short) 12);  //字体大小
        style.setFont(font2);//选择需要用到的字体格式

        //创建表头
        HSSFSheet sheet = workbook.createSheet("sheet");
        HSSFRow row = sheet.createRow(0);
        HSSFCell cell_A = row.createCell(0);
        cell_A.setCellStyle(style);
        cell_A.setCellValue("行政区域");
        HSSFCell cell_B = row.createCell(1);
        cell_B.setCellStyle(style);
        cell_B.setCellValue("区县名称");
        HSSFCell cell_C = row.createCell(2);
        cell_C.setCellStyle(style);
        cell_C.setCellValue("各地上报数量");

        //查询出河南数据
       // ExcelExample excelExample = new ExcelExample();
        //excelExample.createCriteria().andCodeBeforeEqualTo(Integer.valueOf(Province.HN));
        //List<Excel> excelList = excelMapper.selectByExample(excelExample);

        //查出所有的省份并分组
        ProvincesExample provincesExample = new ProvincesExample();
        provincesExample.setDistinct(true);
        List<Provinces> provincesList = provincesMapper.selectByExample(provincesExample);

        for (int j = 0; j < provincesList.size(); j ++){

            //System.out.println(j + "--->" + j);
            ExcelExample excelExample = new ExcelExample();
            excelExample.createCriteria().andCodeBeforeEqualTo(Integer.valueOf((provincesList.get(j).getCode())));
            List<Excel> excelsList = excelMapper.selectByExample(excelExample);
            //各个省市对应的区县
            ExcelExample excelExample1 = new ExcelExample();
            excelExample1.createCriteria().andCodeBeforeEqualTo(Integer.valueOf(Province.HN));
            List<Excel> excels = excelMapper.selectByExample(excelExample1);
            System.out.println(excels.size() + "-------->" + j);
            // 合并日期占两行(4个参数，分别为起始行，结束行，起始列，结束列)
            // 行和列都是从0开始计数，且起始结束都会合并
            // 这里是合并excel中日期的两行为一行
//            CellRangeAddress region = new CellRangeAddress( getRow(excels.size()), excels.size(), 0, 0);
//            sheet.addMergedRegion(region);

            //控制首列合并的值
//            HSSFRow row2 = sheet.createRow(1);
//            HSSFCell cell_20 = row2.createCell(0);//控制该列数据的从第几列显示
//            cell_20.setCellValue(excels.get(j).getName());
//            cell_20.setCellStyle(style);
            for (int i = 0; i < excels.size(); i++){
                HSSFRow row2 = sheet.createRow(i + 1);
                //创建一列数据 显示区县名称
                HSSFCell cell_21 = row2.createCell(1);//控制该列数据的从第几列显示
                cell_21.setCellValue(excels.get(i).getName());
                //显示各地上报数量
                HSSFCell cell_22 = row2.createCell(2);
                if (excels.get(i).getAuditnum() == null || excels.get(i).getAuditnum() == ' '){
                    cell_22.setCellValue(0);
                }else {
                    cell_22.setCellValue(excels.get(i).getAuditnum());
                }
            }

        }

        // 合并日期占两行(4个参数，分别为起始行，结束行，起始列，结束列)
        // 行和列都是从0开始计数，且起始结束都会合并
        // 这里是合并excel中日期的两行为一行
//        CellRangeAddress region = new CellRangeAddress(1, excelList.size(), 0, 0);
//        sheet.addMergedRegion(region);

//       // 测试第一列分地区打印
//        for (int i = 0; i < excelList.size(); i ++){
////            CellRangeAddress region = new CellRangeAddress( 1, excelList.size(), 0, 0);
////            sheet.addMergedRegion(region);
////            Region region = new Region(0,1,0,excelList.size());
//
//            HSSFRow row2 = sheet.createRow(i+1);
//            HSSFCell cell_20 = row2.createCell(0);//控制该列数据的从第几列显示
//            cell_20.setCellValue("河南省");
//            cell_20.setCellStyle(style);
//            //创建一列数据 显示区县名称
//            HSSFCell cell_21 = row2.createCell(1);//控制该列数据的从第几列显示
//            cell_21.setCellValue(excelList.get(i).getName());
//            //显示各地上报数量
//            HSSFCell cell_22 = row2.createCell(2);
//            cell_22.setCellValue(excelList.get(i).getAuditnum());
//
//        }



        File file = new File("E:\\demo.xls");
        FileOutputStream fout = new FileOutputStream(file);
        workbook.write(fout);
        fout.close();
    }

    public int getRow(int endCol){
        if (endCol == 11){
            return 1;
        }
        return endCol + 1;
    }

    @Test
    public void test() throws IOException {
        System.out.println(getRow(38));
        Workbook wb = new HSSFWorkbook();
        Sheet sheet = wb.createSheet("hi sheet");
        Row row = sheet.createRow(1);
        Cell cell = row.createCell(1);
        cell.setCellValue("测试合并单元格");
        sheet.addMergedRegion(new CellRangeAddress(1, 2, 1, 3));


        FileOutputStream fileOutputStream = new FileOutputStream("D://合并.xls");
        wb.write(fileOutputStream);
        fileOutputStream.close();
        fileOutputStream.close();

    }

}
