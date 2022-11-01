package ch15;
/* 실행을 해보면 abc메서드가 끝난후 bcd메서드가 실행되는 것을 알 수 있다. cde 메서드는 별개로 동작한다. */
class MyData2{
    synchronized void abc(){    //this 객체가 갖고있는 하나의 열쇠를 함께 사용
        for(int i = 0; i< 3; i++){
            System.out.println(i + "sec");
            try{Thread.sleep(1000);}catch (InterruptedException e){}
        }
    }
    synchronized  void bcd(){   //this 객체가 갖고있는 하나의 열쇠를 함께 사용
        for(int i = 0; i< 3; i++){
            System.out.println(i + "초");
            try{Thread.sleep(1000);}catch (InterruptedException e){}
        }
    }
    void cde(){
        synchronized (new Object()) {   //Object 객체가 갖고 있는 열쇠를 사용
            for(int i = 0; i< 3; i++){
                System.out.println(i + "번째");
                try{Thread.sleep(1000);}catch (InterruptedException e){}
            }
        }
    }
}
public class KeyObject_1 {
    public static void main(String[] args) {
        //공유객체
        MyData2 myData = new MyData2();
        //3개의 쓰레드가 각각 메서드 호출
        new Thread(){
            public void run(){
                myData.abc();
            }
        }.start();
        new Thread(){
            public void run(){
                myData.bcd();
            }
        }.start();
        new Thread(){
            public void run(){
                myData.cde();
            }
        }.start();
    }
}
