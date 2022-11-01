package ch17;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
* Set<E>
* 인덱스 정보를 포함하고있지 않아서 데이터를 구분하는 유일할 방법이 데이터 그 자체이다.
* 따라서 동일한 데이터의 중복 저장을 허용하지 않는다.
* */
public class HashSetMethod {
    public static void main(String[] args) {
        Set<String> hSet1 = new HashSet<>();
        //1.add
        hSet1.add("가");
        hSet1.add("나");
        hSet1.add("가");
        System.out.println(hSet1.toString());
        //2.addAll(다른 Set 객체)
        Set<String> hSet2 = new HashSet<>();
        hSet2.add("나");
        hSet2.add("다");
        hSet2.addAll(hSet1);
        System.out.println(hSet2.toString());
        //3.remove(Object o)
        hSet2.remove("나");
        System.out.println(hSet2.toString());
        //4.clear()
        hSet2.clear();
        System.out.println(hSet2.toString());
        //5.isEmpty()
        System.out.println(hSet2.isEmpty());
        //6.contains (Object o)
        Set<String> hSet3 = new HashSet<>();
        hSet3.add("가");
        hSet3.add("나");
        hSet3.add("다");
        System.out.println(hSet3.contains("나"));
        System.out.println(hSet3.contains("라"));
        //7.size()
        System.out.println(hSet3.size());
        //8.iterator()
        Iterator<String> iterator = hSet3.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //9.toArray()
        Object[] objArray = hSet3.toArray();
        System.out.println(Arrays.toString(objArray));
        //10-1.toArray(T[] t)
        String[] strArray1 = hSet3.toArray(new String[0]);
        System.out.println(Arrays.toString(strArray1));
        //10-2.toArray(T[] t)
        String[] strArray2 = hSet3.toArray(new String[5]);
        System.out.println(Arrays.toString(strArray2));
    }
}
