package ch15;
//공유객체
class MyData{
    int data = 3;
    public synchronized void plusData(){
        int mydata = data;
        try{Thread.sleep(2000);}catch (InterruptedException e ){}
        data = mydata +1;
    }
}
//공유 객체를 사용하는 메서드
class PlusThread extends Thread{
    MyData myData;
    public PlusThread(MyData myData){
        this.myData = myData;
    }

    @Override
    public void run() {
        myData.plusData();
        System.out.println(getName()+" 실행결과 : "+myData.data);
    }
}
public class SynchronizedMethod {
    public static void main(String[] args) {

        /* 한 쓰레드가 동기화 메서드를 사용한 후 다른메서드가 동기화 메서드를 사용할 수 있다. */
        //공유객체 생성
        MyData myData = new MyData();

        Thread plusThread1 = new PlusThread(myData);
        plusThread1.setName("plusThread1");
        plusThread1.start();

        try{Thread.sleep(1000);}catch (InterruptedException e){}

        Thread plusThread2 = new PlusThread(myData);
        plusThread2.setName("plusThread2");
        plusThread2.start();
    }
}
