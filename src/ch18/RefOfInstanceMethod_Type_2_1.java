package ch18;

interface AAA{
    void abc(BBB b, int k);
}
class BBB{
    void bcd(int k){
        System.out.println(k);
    }
}
public class RefOfInstanceMethod_Type_2_1 {
    public static void main(String[] args) {
        //람다식
        AAA a1 = (BBB b, int k) -> {b.bcd(k);};
        //직접 정의한 인스턴스 메서드 참조
        AAA a2 = BBB::bcd;

        a1.abc(new BBB(), 3);
        a2.abc(new BBB(), 3);

    }
}
