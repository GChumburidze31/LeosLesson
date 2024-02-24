import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    System.out.println("Give me your number");
    int leosInfo = sc.nextInt(); // 20, 21, 22, 23, 24

    for (int i = leosInfo; i <= 100; i++){
        System.out.print(i + " ");
    }



    }
}
