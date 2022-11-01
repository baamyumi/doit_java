package ch15;

class MyThread5 extends Thread{
    @Override
    public void run() {
        for(long i = 0;i<100000000;i++){}//시간지연
    }
}

class MyThread6 extends Thread{
    MyThread5 myThread5;
    public MyThread6(MyThread5 myThread5){
        this.myThread5 = myThread5;
    }

    @Override
    public void run() {
        try{
           myThread5.join(3000);  //myThread5에게 최대 3초동안 CPU 우선 사용권 부여
        }catch (InterruptedException e){
            System.out.println("--join(...) 진행 중 interrupt() 발생");
            for(long i = 0;i<100000000;i++){}//시간지연
        }
    }
}
public class TimeWaiting_Join {
    public static void main(String[] args) {
        //객체 생성
        MyThread5 myThread5 = new MyThread5();
        MyThread6 myThread6 = new MyThread6(myThread5);
        myThread5.start();
        myThread6.start();
        
        try{Thread.sleep(100);}catch (InterruptedException e ){}  //쓰레드 시작 준비시간
        System.out.println("MyThread5 state ="+ myThread5.getState());
        System.out.println("MyThread6 state ="+ myThread6.getState());
        //TIMED_WAITING
        myThread6.interrupt();
        try{Thread.sleep(100);}catch (InterruptedException e ){}  //인터럽트 준비시간
        System.out.println("MyThread5 state ="+ myThread5.getState());
        System.out.println("MyThread6 state ="+ myThread6.getState());
        
    }
}
