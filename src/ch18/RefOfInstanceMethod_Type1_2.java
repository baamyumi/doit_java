package ch18;

interface A2{
    void abc(int k);
}
public class RefOfInstanceMethod_Type1_2 {
    public static void main(String[] args) {
        //1. 익명 이너 클래스
        A2 a1 = new A2(){
            @Override
            public void abc(int k) {
                System.out.println(k);
            }
        };
        //2. 람다식으로 표현
        A2 a2 = (int k) -> {
            System.out.println(k);
        };
        //3. 인스턴스 메서드 활용
        A2 a3 = System.out::println;
        a1.abc(3);
        a2.abc(3);
        a3.abc(3);
    }
}
