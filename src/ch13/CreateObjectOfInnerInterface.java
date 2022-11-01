package ch13;

class AAA{
    interface B{    //이너인터페이스는 static을 명시하지 않아도 자동으로 static 지정
        public abstract void bcd();
    }
}
class CCC implements AAA.B{
    public void bcd(){
        System.out.println("이너 인터페이스 구현 클래스 생성");
    }
}
public class CreateObjectOfInnerInterface {
    public static void main(String[] args) {
        //객체 생성방법1(자식 클래스 직접 생성)
        AAA.B ab = new CCC();
        CCC c = new CCC();
        c.bcd();

        //객체 생성방법2(익명 이너클래스 생성)
        AAA.B b = new AAA.B(){
            public void bcd(){
                System.out.println("익명 이너클래스로 객체 생성");
            }
        };
        b.bcd();
    }
}
