package ch09;

class B{
    void abc(){
        System.out.println("instance 메서드");
    }

    static void bcd(){
        System.out.println("static 메서드");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        B b = new B();
        b.abc();    //인스턴스 매서드

        B.bcd();    //정적 메서드
        b.bcd();    //생성된 객체를 사용한 정적 메서드 > 권장하지 않음
    }
}
