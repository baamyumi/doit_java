package ch18;
interface A6{
    B6 abc();
}
class B6{
    B6(){
        System.out.println("첫번째 생성자");
    }
    B6(int k){
        System.out.println("두번째 생성자");
    }
}
public class RefOfClassConstructor_1 {
    public static void main(String[] args) {

        //람다식
        A6 a1 = () -> new B6();

        //클래서 생성자 참조
        A6 a3 = B6::new;

        a1.abc();
        a3.abc();
    }
}
