

public class Demo01Method {
    public static void main(String[] args) {
        printMethod();
        print2Method();

    }
    public static void printMethod(){
        for (int j = 0; j  < 5; j ++) {
            for (int i = 1 ;i <= 20 ; i ++ ){
                System.out.print("*");
            }
            System.out.println();

        }

    }
    public static void print2Method(){
        int f = 0;
        for (int i = 0; i  < 5; i ++) {
            for (int i1 = 0; i1 < 10; i1++) {
                System.out.print("刘安东"+(f =i1+1));

            }
            System.out.println();

        }

    }
}
123123123121

