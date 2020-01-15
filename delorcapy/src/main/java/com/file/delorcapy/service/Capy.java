package com.file.delorcapy.service;

import org.springframework.stereotype.Component;

import java.io.*;

/**
 * @description:
 * @author: ZYF
 * @date: 2020-01-14 12:22
 */

@Component
public class Capy {

    public void test(String sourcePath, String tarPath) throws IOException {

//        String sourceDirname = "E:\0二普多媒体照片打码处理后数据\31上海";
//        String copyDirname = "D:\0二普多媒体照片打码处理后数据\31上海";
        File sf = new File(sourcePath);
        File cf = new File(tarPath);
        if (!cf.exists()) {
            cf.mkdir();
        }
        copyDir(sf, cf);
        System.out.println("CAPY" + sourcePath + "SUCCESS");
    }

    private void copyDir(File sf, File tf) throws IOException {
        File[] sfiles = sf.listFiles();
        for (File sfile : sfiles) {
            if (sfile.isFile()) {
                String canonicalPath = sfile.getCanonicalPath();
//                System.out.println(sfile.getAbsolutePath());
                String[] split = canonicalPath.split("照片\\\\");
                String s = split[1];
                String s1 = s.split("\\\\")[0];
                System.out.println(s.split("\\\\")[0]);
                if (s1.equals("行政区域")) {
                    copyfile(sfile, tf);
                    System.out.println("复制" + sf.getName() + "文件成功");
                } else {
                    System.out.println("啥也不是");
                }
            } else if (sfile.isDirectory()) {
                File newDir = new File(tf.getAbsoluteFile(), sfile.getName());
                System.out.println(sfile.getName() + "--------------------------------->");

                newDir.mkdirs();
                copyDir(sfile, newDir);
                System.out.println("复制" + newDir.getName() + "文件夹成功");
            }
        }
    }

    private void copyfile(File sfile, File tf) {
        try (
                FileInputStream in = new FileInputStream(sfile.getAbsoluteFile());
                FileOutputStream out = new FileOutputStream(tf.getAbsoluteFile() + "\\" + sfile.getName())
        ) {
            byte[] buff = new byte[1024 * 8];
            int hasRead = 0;
            while ((hasRead = in.read(buff)) > 0) {
                out.write(buff);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
