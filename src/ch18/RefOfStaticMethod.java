package ch18;

interface AA{
    void abc();
}
class BB{
    static void bcd(){
        System.out.println("메서드");
    }
}
public class RefOfStaticMethod {
    public static void main(String[] args) {
        //1. 익명 이너 클래스
        AA a1 = new AA(){
            @Override
            public void abc() {
                BB.bcd();
            }
        };
        //2. 람다식으로 표현
        AA a2 = () -> {BB.bcd();};
        //3. 정적메서드 참조
        AA a3 = BB::bcd;    //클래스명::정적메서드명
        a1.abc();
        a2.abc();
        a3.abc();
    }
}
