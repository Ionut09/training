package com.java.training.day2.io;

import java.io.File;

public class FileAPI {

    public static void main(String[] args) {
        /*
        exists(), getName(), getAbsolutPath(), isDirectory(), isFile(), length(),
        lastModified(), delete(), renameTo(File), mkdir(), mkdirs(), getParent(), listFiles()
         */

        File file = new File("./src/cat.txt");
        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.length());
        System.out.println(file.renameTo(new File("cat.txt")));

        File folder = new File("./cat.txt");
        boolean mkdir = folder.mkdir();

        File folderInFolder = new File("./folder/unAltFolder");
        folderInFolder.mkdirs();

        System.out.println(file.getParent());
        File srcFile = new File("./src/main");
        File[] filesFromSrc = srcFile.listFiles();

        for (File fileSrc : filesFromSrc) {
            System.out.println(fileSrc);
        }

    }
}
