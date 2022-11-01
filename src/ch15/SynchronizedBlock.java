package ch15;
//공유객체
class MyData1{
    int data = 3;
    public void plusData(){
        synchronized (this) {   //코드블럭을 동기화
            int mydata = data;
            try{Thread.sleep(2000);}catch (InterruptedException e){}
            data = mydata +1;
        }
    }
}
//공유 객체를 사용하는 메서드
class PlusThread1 extends Thread{
    MyData1 myData;
    public PlusThread1(MyData1 myData){
        this.myData = myData;
    }

    @Override
    public void run() {
        myData.plusData();
        System.out.println(getName()+" 실행결과 : "+myData.data);
    }
}
public class SynchronizedBlock {
    public static void main(String[] args) {

        /* 한 쓰레드가 동기화 메서드를 사용한 후 다른메서드가 동기화 메서드를 사용할 수 있다. */
        //공유객체 생성
        MyData1 myData = new MyData1();

        Thread plusThread1 = new PlusThread1(myData);
        plusThread1.setName("plusThread1");
        plusThread1.start();

        try{Thread.sleep(1000);}catch (InterruptedException e){}

        Thread plusThread2 = new PlusThread1(myData);
        plusThread2.setName("plusThread2");
        plusThread2.start();
    }
}
