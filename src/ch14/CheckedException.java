package ch14;

import org.xml.sax.ext.Attributes2;

import java.io.*;

class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class B{}
class C extends B{}

public class CheckedException {
    public static void main(String[] args) {
        /* 일반예외 : 일반예외는 예외처리를 하지않으면 문법오류로 인해 실행 자체가 불가능하다. */

        //1. InterruptedException
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //2. ClassNotFoundException
        try {
            Class cls = Class.forName("java.lang.Object");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //3. IOException
        InputStreamReader in = new InputStreamReader(System.in);
        try {
            in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //4. FileNotFoundException
        try {
            FileInputStream fis = new FileInputStream("text.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //5. CloneNotSupportedException
        A a1 = new A();
        try {
            A a2 = (A)a1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        /* 실행예외 : 프로세스 실행중에 발생하는 예외 > 예외처리를 해주지않아도 컴파일은 되지만 예외발생시 프로그램 강제종료 */

        //1. ArithmeticException
        System.out.println(3/0);

        //2. ClassCastException
        B b = new B();
        C c = (C)b;

        //3. ArrayIndexOutOfBoundException
        int[] array = {1,2,3};
        System.out.println((array[3]));

        //4. NumberFormatException
        int num = Integer.parseInt("10!");

        //5. NummPointerException
        String str = null;
        System.out.println(str.charAt(2));
    }
}
