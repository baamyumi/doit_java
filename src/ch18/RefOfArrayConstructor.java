package ch18;

interface A5{
    int[] abc(int len);
}
public class RefOfArrayConstructor {
    public static void main(String[] args) {
        //람다식
        A5 a1 = (int len) -> {
            return new int[len];
        };
        //배열의 생성자 참조
        A5 a2 = int[]::new;

        int[] array1 = a1.abc(3);
        System.out.println(array1.toString());
        int[] array2 = a2.abc(3);
        System.out.println(array2.toString());
    }
}
