package day18_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        int input = 5;

        for (int i = 1; i <= input ; i++) {
            for (int j = 1; j <= input ; j++) {
                System.out.print(i+"*"+j +"="+ (i*j)+"  ");
            }
            System.out.println();
        }



    }
}
