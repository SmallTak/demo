package com.mzb.dmxxk;

import com.github.pagehelper.PageInfo;
import com.mzb.dmxxk.entity.TblPlaceAttrinfoExample;
import com.mzb.dmxxk.entity.TblPlaceAttrinfoWithBLOBs;
import com.mzb.dmxxk.mapper.TblPlaceAttrinfoMapper;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * @description:
 * @author: ZYF
 * @date: 2020-01-06 12:19
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = { DmxxkApplication.class }) // 指定启动类
public class Testservice {

    @Autowired
    private TblPlaceAttrinfoMapper attrinfoMapper;

    @Test
    public void  home(){
        TblPlaceAttrinfoExample tblPlaceAttrinfoWithBLOBs = new TblPlaceAttrinfoExample();
        tblPlaceAttrinfoWithBLOBs.createCriteria().andStandardNameLike("尼"+ "%");
        List<TblPlaceAttrinfoWithBLOBs> tblPlaceAttrinfoWithBLOBsother = attrinfoMapper.selectByExampleWithBLOBs(tblPlaceAttrinfoWithBLOBs);

        PageInfo<TblPlaceAttrinfoWithBLOBs> pageInfo = new PageInfo<>(tblPlaceAttrinfoWithBLOBsother);
        System.out.println(pageInfo.getTotal()/4+1);

    }

    @Test
    public void test() throws IOException {
        FileInputStream fileInputStream=new FileInputStream("E:/demo.xls");  //获取d://test.xls,建立数据的输入通道

        POIFSFileSystem poifsFileSystem=new POIFSFileSystem(fileInputStream);  //使用POI提供的方法得到excel的信息

        HSSFWorkbook Workbook=new HSSFWorkbook(poifsFileSystem);//得到文档对象

        HSSFSheet sheet=Workbook.getSheetAt(0);  //根据name获取sheet表

        HSSFRow row=sheet.getRow(0);  //获取第一行

        System.out.println(sheet.getLastRowNum()+" "+row.getLastCellNum());  //分别得到最后一行的行号，和一条记录的最后一个单元格

        FileOutputStream out=new FileOutputStream("E:/demo.xls");  //向d://test.xls中写数据
        row=sheet.createRow((short)(sheet.getLastRowNum()+1)); //对总行数减4，就是倒数行数加数据
        row.createCell(0).setCellValue("11111"); //设置第一个（从0开始）单元格的数据
        row.createCell(1).setCellValue(11111);
        out.flush();
        Workbook.write(out);
        out.close();
        System.out.println(row.getPhysicalNumberOfCells()+" "+row.getLastCellNum());

    }

}
