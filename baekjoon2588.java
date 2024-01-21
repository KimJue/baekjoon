import java.util.Scanner;

public class baekjoon2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int num3 = num2%10;
        System.out.println(num1 * num3);
        int num4 = (num2%100) / 10;
        System.out.println(num1 * num4);
        int num5 = num2 / 100;
        System.out.println(num1 * num5);
        System.out.println(num1 * num2);
        sc.close();
    }
}