package ch15;

class MyThread4 extends Thread{
    @Override
    public void run() {
        try{
            Thread.sleep(300);
        }catch (InterruptedException e){
            System.out.println("--sleep() 진행 주 interrupt 발생");
            for(long i = 0;  i <100000000;i++){}
        }
    }
}
public class TimeWaiting {
    public static void main(String[] args) {
        MyThread4 myThread = new MyThread4();
        myThread.start();

        try{Thread.sleep(100);} catch(InterruptedException e){} //쓰레드 시작 준비시간
        System.out.println("MyThread State ="+ myThread.getState());
        //TIMED_WAITING
        myThread.interrupt();   //TIMED_WAITING > Runnable 상태로 전황
        try{Thread.sleep(100);}catch (InterruptedException e){}  //인터럽트 준비시간
        System.out.println("MyThread State ="+ myThread.getState());
    }
}
