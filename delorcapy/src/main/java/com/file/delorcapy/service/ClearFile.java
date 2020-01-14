package com.file.delorcapy.service;

import org.springframework.stereotype.Component;

import java.io.File;

/**
 * @description:
 * @author: ZYF
 * @date: 2020-01-14 13:13
 */

@Component
public class ClearFile {

    static int iFile = 0;

    public void clear() {
        // dir_str清理文件夹的路径
        String dir_str = "D:\0二普多媒体照片打码处理后数据\31上海";
        File dir = new File( dir_str );
        clear( dir );
        System.out.println( "清理成功。" );
        System.out.println( "共清理了" + iFile + "个空文件夹" );
    }

    public static void clear( File dir )
    {
        File[] dirs = dir.listFiles();
        for( int i = 0; i < dirs.length; i++ )
        {
            if( dirs[i].isDirectory() )
            {
                clear( dirs[i] );
            }
        }
        if( dir.isDirectory() && dir.delete() )
            iFile++;
        System.out.println( dir + "清理成功" );

    }

}
