package ch18;

interface A4{
    int abc(String str);
}
public class RefOfInstanceMethod_Type_2_2 {
    public static void main(String[] args) {
        //람다식
        A4 a1 = (String str) -> str.length();
        //자바가 제공하는 인스턴스 메서드 참조
        A4 a2 = String::length;

        System.out.println(a1.abc("안녕"));
        System.out.println(a2.abc("안녕"));

    }
}
