package ch18;

interface A1{
    void abc();
}
class B1{
    void bcd(){
        System.out.println("메서드");
    }
}
public class RefOfInstanceMethod_Type1_1 {
    public static void main(String[] args) {
        //1. 익명 이너 클래스
        A1 a1 = new A1(){
            @Override
            public void abc() {
                B1 b = new B1();
                b.bcd();
            }
        };
        //2. 람다식으로 표현
        A1 a2 = () -> {
            B1 b = new B1();
            b.bcd();
        };
        //3. 정의된 인스턴스 메서드 참조
        B1 b = new B1();
        A1 a3 = b::bcd;
        a1.abc();
        a2.abc();
        a3.abc();

    }
}
