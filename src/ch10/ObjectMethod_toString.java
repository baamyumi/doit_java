package ch10;
class C{    //컴파일러가 extends Object를 자동으로 추가
    int a = 3;
    int b = 4;
}
class D{
    int a = 3;
    int b = 4;

    @Override
    public String toString(){
        return "필드값(a,b) =" + a + " "+ b;
    }
}

public class ObjectMethod_toString {
    public static void main(String[] args) {
        C c = new C();
        D d = new D();

        System.out.printf("%x\n", c.hashCode());
        System.out.println(c.toString());
        System.out.println(d);  //println() 메서드는 객체를 출력하면 자동으로 객체 내의 toString()메서드를 호출한다.
    }
}
