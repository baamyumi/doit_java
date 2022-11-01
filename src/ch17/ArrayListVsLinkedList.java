package ch17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
* 검색속도 : ArrayList > LinkedList
* 데이터추가, 삭제 속도 : ArrayList < LinkedList
* */
public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        //1.데이터 추가 시간 비교
        List<Integer> aList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        long startTime = 0, endTime = 0;

        //1-1. ArrayList 데이터 추가시간
        startTime = System.nanoTime();
        for(int i = 0; i<100000; i++){
            aList.add(0, i);
        }
        endTime = System.nanoTime();
        System.out.println(("ArrayList 데이터 추가 시간 = " + (endTime - startTime) + "ns"));
        //1-2. LinkedList 데이터 추가 시간
        startTime = System.nanoTime();
        for(int i = 0; i<100000; i++){
            linkedList.add(0, i);
        }
        endTime = System.nanoTime();
        System.out.println(("LinkedList 데이터 추가 시간 = " + (endTime - startTime) + "ns"));

        //2-1. ArrayList 데이터 검색시간
        startTime = System.nanoTime();
        for(int i = 0; i<100000; i++){
            aList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println(("ArrayList 데이터 검색 시간 = " + (endTime - startTime) + "ns"));
        //1-2. LinkedList 데이터 검색 시간
        startTime = System.nanoTime();
        for(int i = 0; i<100000; i++){
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println(("LinkedList 데이터 검색 시간 = " + (endTime - startTime) + "ns"));

        //2-1. ArrayList 데이터 제거 시간
        startTime = System.nanoTime();
        for(int i = 0; i<100000; i++){
            aList.remove(0);
        }
        endTime = System.nanoTime();
        System.out.println(("ArrayList 데이터 제거 시간 = " + (endTime - startTime) + "ns"));
        //1-2. LinkedList 데이터 제거 시간
        startTime = System.nanoTime();
        for(int i = 0; i<100000; i++){
            linkedList.remove(0);
        }
        endTime = System.nanoTime();
        System.out.println(("LinkedList 데이터 제거 시간 = " + (endTime - startTime) + "ns"));
    }
}
