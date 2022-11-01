package ch10;

class A1{
    A1(){
        this(3);
        System.out.println("A1 생성자 1");
    }
    A1(int a){
        System.out.println("A1 생성자 2");
    }
}
class B1 extends A1{
    B1(){
        this(3);
        System.out.println("B1 생성자 1");
    }
    B1(int a){
        System.out.println("B1 생성자 2");
    }
}
public class SuperMethod {
    public static void main(String[] args) {
        //A1 객체생성
        A1 aa1 = new A1();
        System.out.println();
        A1 aa2 = new A1(3);
        System.out.println();

        //B1 객체생성
        B1 bb1 = new B1();
        System.out.println();
        B1 bb2 = new B1(3);
    }
}
