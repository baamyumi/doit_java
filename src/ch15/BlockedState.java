package ch15;

/* 3개의 쓰레드가 같은 한 객체의 동기화 쓰레드를 실행시키려고한다.
* 한 쓰레드가 먼저 실행되면 나머지는 Blocked 상태가 되고
* 이후 열쇠가 반납되면 나머지 두 쓰레드가 경쟁하여 열쇠를 차지하고 동기화 메서드를 실행하게된다. */
class MyBlockTest{

    //공유객체
    MyClass mc = new MyClass();
    //3개의 쓰레드 필드 생성
    Thread t1 = new Thread("thread1"){
        public void run(){
            mc.syncMethed();
        }
    };
    Thread t2 = new Thread("thread2"){
        public void run(){
            mc.syncMethed();
        }
    };
    Thread t3 = new Thread("thread3"){
        public void run(){
            mc.syncMethed();
        }
    };

    void startAll(){
        t1.start();
        t2.start();
        t3.start();
    }

    class MyClass{
        synchronized void syncMethed(){
            try{Thread.sleep(100);}catch(InterruptedException e){}
            System.out.println("==="+Thread.currentThread().getName() + "====");
            System.out.println("thread1 ->"+ t1.getState());
            System.out.println("thread2 ->"+ t2.getState());
            System.out.println("thread3 ->"+ t3.getState());
            for(long i = 0;i<100000000;i++){}//시간지연
        }
    }
}

public class BlockedState {
    public static void main(String[] args) {
        MyBlockTest mbt = new MyBlockTest();
        mbt.startAll();
    }
}
