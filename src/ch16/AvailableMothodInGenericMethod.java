package ch16;

class A{
    public <T> void method(T t){
        /* 제네릭 메서드 내부에서는 Object의 메서드만 사용 할 수있다. String 메서드 호출 불가능 */
        //System.out.println(t.length());
        System.out.println(t.equals("안녕"));
    }
}
public class AvailableMothodInGenericMethod {
    public static void main(String[] args) {
        A a = new A();
        a.<String>method("안녕");
    }
}
