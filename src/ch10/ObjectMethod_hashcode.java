package ch10;

import java.util.HashMap;

class AA{
    String name;
    AA(String name){
        this.name = name;
    }
    @Override
    public boolean equals(Object obj){
        if(this.name == ((AA)obj).name){
            return true;
        } else return false;
    }
    @Override
    public String toString(){
        return name;
    }
}
class BB{
    String name;
    BB(String name){
        this.name = name;
    }
    @Override
    public boolean equals(Object obj){
        if(this.name == ((BB)obj).name){
            return true;
        } else return false;
    }
    @Override
    public int hashCode(){
        return name.hashCode();
    }
    @Override
    public String toString(){
        return name;
    }
}
public class ObjectMethod_hashcode {
    public static void main(String[] args) {
        HashMap<Integer, String> hm1 = new HashMap<>();
        hm1.put(1,"데이터1");
        hm1.put(1,"데이터2");
        hm1.put(2,"데이터3");
        System.out.println(hm1);

        HashMap<AA, String> hm2 = new HashMap<>();
        hm2.put(new AA("첫번째"), "데이터1");
        hm2.put(new AA("첫번째"), "데이터2");
        hm2.put(new AA("두번째"), "데이터3");
        System.out.println(hm2);

        HashMap<BB, String> hm3 = new HashMap<>();
        hm3.put(new BB("첫번째"), "데이터1");
        hm3.put(new BB("첫번째"), "데이터2");
        hm3.put(new BB("두번째"), "데이터3");
        System.out.println(hm3);
    }
}
