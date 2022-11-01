package ch16;
//제네릭 메서드 상송

class Parent1{
    <T extends Number> void print(T t){
        System.out.println(t);
    }
}

class Child3 extends Parent1{

}
public class InheritanceGenericMethod {
    public static void main(String[] args) {

        //부모 클래스에서 제네릭 메서드 이용
        Parent1 p = new Parent1();
        p.<Integer>print(10);
        p.print(10);

        //자식 클래스에서 제네릭 메서드 이용
        Child3 c = new Child3();
        c.<Double>print(5.8);
        p.print(5.8);
    }
}
