package ch13;

interface AA{
    public abstract void abc();
}
class CC{
    void cde(AA a){
        a.abc();
    }
}
public class AnnonymousClass_4 {
    public static void main(String[] args) {
        CC c = new CC();
        //익명이너클래스를 이용한 입력매개변수 객체 전달
        //방법1. 클래스명 X + 참조 변수명 O
        AA a = new AA(){
            public void abc(){
                System.out.println("방법1 입력매개변수 전달");
            }
        };
        c.cde(a);

        //방법1. 클래스명 X + 참조 변수명 X
        c.cde(new AA(){
            public void abc(){
                System.out.println("방법2 입력매개변수 전달");
            }
        });
    }
}
