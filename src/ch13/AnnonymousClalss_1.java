package ch13;

class A{
    C c = new C(){
        public void bcd(){
            System.out.println("익명 이너 클래스");
        }
    };
    void abc(){
        c.bcd();
    }
}

interface C{
    public abstract  void bcd();
}

public class AnnonymousClalss_1 {
    public static void main(String[] args) {
        A a = new A();
        a.abc();
    }
}
