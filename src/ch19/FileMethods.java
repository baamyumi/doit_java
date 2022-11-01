package ch19;

import java.io.File;

public class FileMethods {
    public static void main(String[] args) {
        //C드라이브 내에 temp폴더가 없을 때 생성
        File tempDir = new File("C:/temp");
        if (!tempDir.exists()) tempDir.mkdir();

        //1. 파일 객체 생성
        File newFile = new File("C:/Windows");
        //2. 파일 메서드
        System.out.println("절대 경로: " + newFile.getAbsolutePath());
        System.out.println("폴더(?): " + newFile.isDirectory());
        System.out.println("파일(?): " + newFile.isFile());
        System.out.println("파일/폴더명 : " + newFile.getName());
        System.out.println("부모 폴더: " + newFile.getParent());
        System.out.println("절대 경로: " + newFile.getAbsolutePath());
        File newFile1 = new File("C:/temp/abc");
        System.out.println(newFile1.mkdir());
        File newFile2 = new File("C:/temp/bcd/cde");
        System.out.println(newFile2.mkdir());
        System.out.println(newFile2.mkdirs());
        File[] fnames = newFile.listFiles();
        for(File fname : fnames){
            System.out.println((fname.isDirectory() ? "폴더:" : "파일: ") + fname.getName());
        }


    }
}
