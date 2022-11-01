package ch19;

import java.io.File;
import java.io.IOException;

public class CreateFileObject {
    public static void main(String[] args) throws IOException {
        //1-1. C드라이브 내에 temp폴더가 없을 때 생성
        File tempDir = new File("C:/temp");
        if (!tempDir.exists()) tempDir.mkdir();
        System.out.println(tempDir.exists());

        //1-2. 파일 객체 생성(실제 파일 생성)
        File newFile = new File("C:/temp/newFile.txt");
        if (!newFile.exists()) newFile.createNewFile(); //temp폴더가 없으면 예외가 발생한다.
        System.out.println(newFile.exists());
        System.out.println();

        //2. 파일 구분자 3가지 방법 [역슬러시두개(\\), 슬러시(/), 파일구분자(File.separator)]
        File newFile2 = new File("C:\\temp\\newFile.txt");
        File newFile3 = new File("C:/temp/newFile.txt");
        File newFile4 = new File("C:"+ File.separator +"temp"+ File.separator +"newFile.txt");

        //3-1. 절대경로
        File newFile5 = new File("C:/abc/newFile.txt");
        System.out.println(newFile5.getAbsolutePath());

        //3-2. 상대경로
        System.out.println(System.getProperty("user.dir")); //현재위치
        File newFile7 = new File("newFile1.txt");
        System.out.println(newFile7.getAbsolutePath());
    }
}
