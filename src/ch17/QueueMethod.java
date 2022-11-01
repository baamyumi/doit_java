package ch17;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethod {
    public static void main(String[] args) {
        /*
        * 데이터 추가 : add, offer
        * 데이터 확인 : element, peek
        * 데이터 추출 : remove, poll
        * */
        //1. 예외 처리 기능 미포함 메서드
        Queue<Integer> queue1 = new LinkedList<>();
        //1-1. add(E item)
        queue1.add(3);
        queue1.add(4);
        queue1.add(5);
        //1-2. element()
        System.out.println(queue1.element());
        //1-3. E remove()
        System.out.println(queue1.remove());
        System.out.println(queue1.remove());
        System.out.println(queue1.remove());
        System.out.println();
        //2. 예외처리 기능 포함 메서드
        Queue<Integer> queue2 = new LinkedList<Integer>();
        System.out.println(queue1.peek());
        //2-1. offer(E item)
        queue2.offer(3);
        queue2.offer(4);
        queue2.offer(5);
        //2-2. E peek()
        System.out.println(queue2.peek());
        //2-3. E poll()
        System.out.println(queue2.poll());
        System.out.println(queue2.poll());
        System.out.println(queue2.poll());
        System.out.println(queue2.poll());
    }
}
