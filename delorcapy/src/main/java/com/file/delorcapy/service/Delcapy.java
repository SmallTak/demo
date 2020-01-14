package com.file.delorcapy.service;

import java.io.*;

/**
 * @description:
 * @author: ZYF
 * @date: 2020-01-14 11:06
 */

public class Delcapy {

    /**
     * 复制文件夹操作
     *
     * @param sourceDir 源文件夹
     * @param destDir   目标文件夹
     * @throws FileNotFoundException
     */
    public static void copyDir(File sourceFile, File destFile) throws FileNotFoundException {
        // 1.判断源文件是否存在
        if (!sourceFile.exists()) {
            throw new FileNotFoundException("源文件夹不存在！");
        }
        // 2.如果目标文件不存在，则新建目标文件夹
        if (!destFile.exists()) {
            destFile.mkdirs();
        }
        // 3.获取源文件夹中所有的子文件(包含文件和文件夹)
        File[] files = sourceFile.listFiles();
        for (File file : files) {
            // 3.1如果是文件，则直接复制文件即可
            if (file.isFile()) {
                // 执行拷贝文件操作
                copyFile(file, new File(destFile, file.getName()));
            }
            // 3.2如果是文件夹，则递归调用
            else if (file.isDirectory()) {

//                File[] files1 = file.listFiles();
//                for (File f : files){
//                    System.out.println(f.getName());
//                    if (f.isDirectory() && f.getName().equals("行政区域")){
//                        copyDir(file, new File(destFile, file.getName()));
//                    }
//                }
            }
            else {
                System.out.println("啥也不是");
            }
        }
    }

    public static void filter(File fromFile,File destFile) throws FileNotFoundException {
        File[] listFiles = fromFile.listFiles();
        for (File subFile : listFiles) {
            if (subFile.getName().equals("行政区域")){
                copyDir(subFile, new File(destFile, subFile.getName()));

            }
            filter(subFile,destFile);
        }
    }

    /**
     * 文件拷贝
     *
     * @param sourceFile 需要拷贝的文件
     * @param destFile   把文件拷贝到哪里去
     */
    public static void copyFile(File sourceFile, File destFile) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            // 1.文件输入流
            FileInputStream fis = new FileInputStream(sourceFile);
            bis = new BufferedInputStream(fis);
            // 2.文件输出流
            FileOutputStream fos = new FileOutputStream(destFile);
            bos = new BufferedOutputStream(fos);
            // 3.读取数据
            byte[] by = new byte[1024];
            int len = 0;
            while ((len = bis.read(by)) != -1) {
                // 4.写入数据
                bos.write(by, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close(); // 关闭输出流
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    bis.close(); // 关闭输入流
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        // 要复制的文件对象
        File sourceDirFile = new File("D:\\test");
        //复制的位置
        File destDirFile = new File("G:\\test");
        try {
            copyDir(sourceDirFile, destDirFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
