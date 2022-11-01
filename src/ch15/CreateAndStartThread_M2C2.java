package ch15;

/* Runnable 인터페이스를 상속받는 객체를 생성한 후 Thread 에 전달하여 실행 > Thread 3개 생성 */

import java.util.Map;

class SMIFileRunnable implements Runnable{

    @Override
    public void run() {
        String[] strArray = {"하나","둘","셋","넷","다섯"};
        try{
            Thread.sleep(10);
        }catch(InterruptedException e){

        }

        for(int i = 0;i<strArray.length; i++){
            System.out.println(" - (자막번호) "+strArray[i]);
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){

            }
        }
    }
}

class VideoFileRunnable implements Runnable{
    @Override
    public void run() {
        int[] intArray = {1,2,3,4,5};

        for(int i = 0;i<intArray.length; i++){
            System.out.println(" - (비디오 프레임) "+intArray[i]);
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){

            }
        }
    }
}

public class CreateAndStartThread_M2C2 {
    public static void main(String[] args) {
        Runnable smiFileRunnable = new SMIFileRunnable();
        //smiFileRunnable.start();  //Runnable 객체에는 start() 메서드가 없어서 오류가 발생한다.
        Thread thread1 = new Thread(smiFileRunnable); //runnable 객체를 Thread에 전달
        thread1.start();

        Runnable videoFileRunnable = new VideoFileRunnable();
        Thread thread2 = new Thread(videoFileRunnable);
        thread2.start();
    }
}
