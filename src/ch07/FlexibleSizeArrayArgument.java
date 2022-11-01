package ch07;

import java.util.Arrays;

public class FlexibleSizeArrayArgument {
    public static void main(String[] args) {
        method1(1,2);
        method1(3,4,5,10);
        method1();

        method2("안녕","감사");
        method2("안녕","감사","하이","땡큐");
        method2();

    }

    public static void method1(int...values){ //가변길이 배열 입력매개변수
        System.out.println("배열의 길이: "+ values.length);
        for(int k : values){
            System.out.print(k + " ");
        }
        System.out.println();
    }

    public static void method2(String...values){
        System.out.println("배열의 길이: "+values.length);
        System.out.println(Arrays.toString(values));
        System.out.println();
    }
}
