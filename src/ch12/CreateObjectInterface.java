package ch12;

interface A{
    int a = 3;
    void abc();
}
class B implements A{
    public void abc(){  //인터페이스는 모든 필드와 메서드가 public으로 강제되므로 자식 클래스에서 public을 반드시 사용한다.
        System.out.println("방법1 : 자식클래스 생설자로 객체 생성");
    }
}

public class CreateObjectInterface {
    public static void main(String[] args) {
        //방법1
        A b1 = new B();
        b1.abc();

        //방법2
        A b2 = new B(){
            public void abc(){
                System.out.println("방법2 : 익명 이너 클래스를 이용한 객체 생성");
            }
        };
        b2.abc();
    }
}
