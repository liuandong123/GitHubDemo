package cn.itcast.day05.demo02;

public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(4,4));
        System.out.println(isSame(5,4));

    }

    public static boolean isSame(int a ,int b){
        boolean same;
        same = a==b;
        return same;

    }
}
