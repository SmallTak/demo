package com.yunfei.task;

import com.yunfei.entity.Excel;
import com.yunfei.entity.ExcelExample;
import com.yunfei.entity.Provinces;
import com.yunfei.entity.ProvincesExample;
import com.yunfei.mapper.ExcelMapper;
import com.yunfei.mapper.ProvincesMapper;
import org.apache.poi.hssf.usermodel.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * @description:
 * @author:
 * @date: 2019-12-26 10:18
 */
@Component
public class PoiOutExcel {
    @Autowired
    private ExcelMapper excelMapper;
    @Autowired
    private ProvincesMapper provincesMapper;

    @Test
    public void excel() throws IOException {

        //设置导出Excel信息
        HSSFWorkbook workbook = new HSSFWorkbook();          // 创建workbook
        HSSFSheet sheet = workbook.createSheet("count");   // 创建sheet, 并设置sheet名
        String fileName = "E:count.xls";                   // 导出Excel文件名与路径
        String[] headers ={"行政区域", "区县名称", "各地上报数量"};    // Excel中表头

        //字体样式
        HSSFCellStyle style = workbook.createCellStyle();
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER); //
        HSSFCellStyle stylEnd = workbook.createCellStyle();
        stylEnd.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
        stylEnd.setAlignment(HSSFCellStyle.ALIGN_CENTER);

        HSSFFont font2 = workbook.createFont();
        font2.setFontName("仿宋_GB2312");
        font2.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);//粗体显示
        font2.setFontHeightInPoints((short) 11);  //字体大小
        style.setFont(font2);//选择需要用到的字体格式

        //查询出数据库中需要导出的数据,若数据排序为无序，则可以先进行分组，再加循环有if逐个输出
//        ExcelExample excelExample1 = new ExcelExample();
//        excelExample1.createCriteria().andCodeBeforeEqualTo(Integer.valueOf(Province.HN));
        List<Excel> excels = excelMapper.selectByExample(new ExcelExample());

        //查出所有的省份并分组
        ProvincesExample provincesExample = new ProvincesExample();
        provincesExample.setDistinct(true);
        List<Provinces> provincesList = provincesMapper.selectByExample(provincesExample);

        HSSFRow headerRow = sheet.createRow(0);            // 创建表头
        for(int i = 0; i < headers.length; i ++){
            HSSFCell cellTemp = headerRow.createCell(i);
            cellTemp.setCellStyle(style);
            HSSFRichTextString headerText = new HSSFRichTextString(headers[i]);
            cellTemp.setCellValue(headerText);
        }
        //插入数据
        int rowNum = 1; //从第二行(表头下一行开始插入)
        for (Excel excel : excels){
            HSSFRow rowTemp = sheet.createRow(rowNum);
            /* 按表头顺序插入姓名、性别、年龄 */
            HSSFCell cell_A = rowTemp.createCell(0);
            cell_A.setCellStyle(style);
            cell_A.setCellValue(excel.getProvinceName());

            HSSFCell cell_B = rowTemp.createCell(1);
            cell_B.setCellValue(excel.getName());
            cell_B.setCellStyle(stylEnd);

            HSSFCell cell_C = rowTemp.createCell(2);
            cell_C.setCellStyle(stylEnd);
            if (excel.getAuditnum() == null || excel.getAuditnum() == ' '){
                cell_C.setCellValue(0);
            }else {
                cell_C.setCellValue(excel.getAuditnum());
            }
            rowNum += 1;
        }
        //输出文件到本地
        File file = new File(fileName);
        FileOutputStream  fout = new FileOutputStream(file);
        workbook.write(fout);
        fout.close();
    }
}
