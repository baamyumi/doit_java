package ch10;
class E{
    String name;
    E(String name){
        this.name = name;
    }
}
class F{
    String name;
    F(String name){
        this.name = name;
    }
    @Override
    public boolean equals(Object obj){  //equals()를 실제 값을 비교하도록 오버라이딩
        if(this.name == ((F)obj).name) {
            return true;
        } else return false;
    }
}
public class ObjectMethod_equals {
    public static void main(String[] args) {
        // ==, equals() : 스택 메모리값비교

        E e1 = new E("안녕");
        E e2 = new E("안녕");
        System.out.println(e1 == e2);
        System.out.println(e1.equals(e2));

        F f1 = new F("안녕");
        F f2 = new F("안녕");
        System.out.println(f1 == f2);
        System.out.println(f1.equals(f2));
    }
}
