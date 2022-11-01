package ch16;

class A1{}
class B1 extends A1{}
class C1 extends B1{}
class D1 extends C1{}

class Goods<T>{
    private T t;
    public T get(){
        return t;
    }
    public void set(T t){
        this.t = t;
    }
}

class Test{
    void method1(Goods<A1> g){}
    void method2(Goods<?> g){}
    void method3(Goods<? extends B1> g){}
    void method4(Goods<? super B1> g){}
}

public class BoundTypeOfInputArgument {
    public static void main(String[] args) {
        Test t = new Test();

        //case1
        t.method1(new Goods<A1>());
        //t.method1(new Goods<B1>()); //에러
        //t.method1(new Goods<C1>()); //에러
        //t.method1(new Goods<D1>()); //에러

        //case2
        t.method2(new Goods<A1>());
        t.method2(new Goods<B1>());
        t.method2(new Goods<C1>());
        t.method2(new Goods<D1>());

        //case3
        //t.method3(new Goods<A1>()); //에러
        t.method3(new Goods<B1>());
        t.method3(new Goods<C1>());
        t.method3(new Goods<D1>());

        //case4
        t.method4(new Goods<A1>());
        t.method4(new Goods<B1>());
        //t.method4(new Goods<C1>()); //에러
        //t.method4(new Goods<D1>()); //에러
    }
}
