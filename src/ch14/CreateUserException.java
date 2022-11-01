package ch14;

/*사용자 정의 예외처리클래스 사용*/
class MyException extends Exception{
    public MyException(){
        super();
    }
    public MyException(String message) {
        super(message);
    }
}

class MyRTException extends RuntimeException{
    public MyRTException(){
        super();
    }
    public MyRTException(String message){
        super(message);
    }
}

class AA{
    MyException me1 = new MyException();
    MyException me2 = new MyException("예외 메시지 : MyException");

    MyRTException mre1 = new MyRTException();
    MyRTException mre2 = new MyRTException("예외 메시지 : MyRTException");

    //1. 예외를 직접 처리
    void abc_1(int num){
        try{
            if(num > 70)
                System.out.println("정상작동");
            else
                throw me1;
        }catch(MyException e){
            System.out.println("예외처리 1");
        }
    }

    void bcd_1(){
        abc_1(65);
    }

    //2. 예외 전가
    void abc_2(int num) throws MyException{
        if(num > 70)
            System.out.println("정상작동");
        else
            throw me1;
    }

    void bcd_2(){
        try{
            abc_2(65);
        }catch(MyException e){
            System.out.println("예외처리 2");
        }
    }
}
public class CreateUserException {
    public static void main(String[] args) {
        AA a = new AA();
        a.bcd_1();
        a.bcd_2();
    }
}
