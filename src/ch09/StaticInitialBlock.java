package ch09;

class C{
    int a;
    static int b;
    static int c = 6; //정적 필드의 간단한 초기화는 선언할때 초기화를 한다.
    static{
        b =5; //복잡한 계산의 결과로 정적 펠드를 초기화해야 할 때는 static{} 내에서 수행한다.
        System.out.println("클래스 C가 로딩되었습니다");
    }
    C() {
        a = 3;
    }
}

public class StaticInitialBlock {
    public static void main(String[] args) {
        System.out.println(C.b); //C.b가 실행되는 시점에 C가 메모리에 로딩되며, 이때 static{} 초기화 블록이 실행됨을 알 수 있다.
        System.out.println(C.c);
    }
}
