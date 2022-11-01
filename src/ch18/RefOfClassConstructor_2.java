package ch18;
interface A7{
    B7 abc(int k);
}
class B7{
    B7(){
        System.out.println("첫번째 생성자");
    }
    B7(int k){
        System.out.println("두번째 생성자");
    }
}
public class RefOfClassConstructor_2 {
    public static void main(String[] args) {

        //람다식
        A7 a1 = (int k) -> new B7(k);

        //클래서 생성자 참조
        A7 a3 = B7::new;

        a1.abc(3);
        a3.abc(3);
    }
}
