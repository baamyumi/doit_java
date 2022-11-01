package ch14;

class BB{
    void abc() throws NumberFormatException{
        bcd();
    }
    void bcd() throws NumberFormatException{
        cde();
    }
    void cde() throws NumberFormatException{
        int num = Integer.parseInt("10A");
    }
}

public class ExceptionMethod {
    public static void main(String[] args) {

        /* 예외 객체의 대표적인 메서드 getMessage() */
        //1.예외 객체를 생성했을 때 메시지를 전달하지 않은 경우
        try{
            throw new Exception();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //2.예외 객체를 생성했을 때 메시지를 전달했을 경우
        try{
            throw new Exception("예외 메시지");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        /* 예외 객체의 대표적인 메서드 printStackTrace() */
        BB b = new BB();
        try{
            b.abc();
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
}
