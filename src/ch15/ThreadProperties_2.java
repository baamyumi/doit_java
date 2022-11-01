package ch15;

class MyThread extends Thread{
    @Override
    public void run() {
        //for(long i = 0; i<1000000000; i++){
            System.out.println(getName() + " 우선순위: " + getPriority());
        //}
    }
}

public class ThreadProperties_2 {
    public static void main(String[] args) {

        //CPU 코어 수
        System.out.println("코어 수 : " + Runtime.getRuntime().availableProcessors());

        //우선순위 자동 지정
        for(int i = 0; i<3; i++){
            Thread thread = new MyThread();
            thread.start();
        }

        try{Thread.sleep(1000);} catch (InterruptedException e){}

        //우선순위 직접지정
        for(int i = 0; i< 10; i++){
            Thread thread = new MyThread();
            thread.setName(i + "번째 쓰레드");
            if(i == 9) thread.setPriority(10);  //가장 마지막에 실행된 쓰레드 객체에 가장 높은 우선순위 부여
            thread.start();
        }
    }
}
