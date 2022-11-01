package ch14;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource_1 {
    public static void main(String[] args) {

        System.out.println("문자를 입력하세요");

        //리소스 자동해제 예외처리
        try(InputStreamReader isr1 = new InputStreamReader(System.in);){
            char input = (char)isr1.read();
            System.out.println("입력 글자 = " + input);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
