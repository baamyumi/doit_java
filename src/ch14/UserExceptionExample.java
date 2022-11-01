package ch14;

//점수가 음수일때 예외 발쌩
class MinusException extends Exception{
    public MinusException(){
        super();
    }
    public  MinusException(String message){
        super(message);
    }
}
//점수가 100점을 초과할 때 예외발생
class OverException extends Exception{
    public OverException(){
        super();
    }
    public OverException(String message){
        super(message);
    }
}

class CCC{
    void checkScore(int score) throws MinusException, OverException{
        if(score < 0){
            throw new MinusException("예외발생 :  음수 입력");
        }
        else if(score > 100){
            throw new OverException("예외발생 : 100점 초과" );
        }
        else{
            System.out.println("정상작동");
        }
    }
}
public class UserExceptionExample {
    public static void main(String[] args) {
        CCC a = new CCC();
        try{
            a.checkScore(85);
            a.checkScore(-1);
        }catch(MinusException | OverException e){
            System.out.println(e.getMessage());
        }
    }
}
