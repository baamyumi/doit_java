package ch18;

interface A{
    void mothod();
}
interface B{
    void mothod2(int a);
}
interface C{
    int mothod3();
}
interface D{
    double mothod4(int a, double b);
}

public class FunctionToLambdaExpression {
    public static void main(String[] args) {
        A a1 = () -> {System.out.println("입력X 리턴X 함수");};
        A a2 = () -> System.out.println("입력X 리턴X 함수");  //명령어 한줄이면 중괄호 생략가능

        B b1 = (int a) -> {System.out.println("입력O 리턴X 함수");};
        B b2 = (a) -> {System.out.println("입력O 리턴X 함수");};  //입력매개변수 생략가능
        B b3 = (a) -> System.out.println("입력O 리턴X 함수"); //명령어 한줄이면 중괄호 생략가능
        B b4 = a -> System.out.println("입력O 리턴X 함수");   //입력매개변수가 1개일 때 소괄호 생략가능

        C c1 = () -> {return 4;};
        C c2 = () -> 4; //실행문에 return만 있는경우 중괄호, return 생략가능

        D d1 = (int a, double b) -> {return a+b;};
        D d2 = (a, b) -> {return a+b;};
        D d3 = (a, b) -> a+b;
    }
}
