package ch14;

public class MultiCatch_3 {
    public static void main(String[] args) {
        //예외의 OR(|) 연산으로 구성한 다중 catch 구문
        try {
            System.out.println(3 / 0);
            int num = Integer.parseInt("10A");
        }catch(ArithmeticException | NumberFormatException e){
            System.out.println("예외가 발생했습니다");
        }
    }
}
