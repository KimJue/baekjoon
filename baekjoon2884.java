import java.util.Scanner;

public class baekjoon2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();

        int a = min - 45;
        if(a < 0)
        {
            hour--;
            a += 60;
        }
        if(hour<0)
        {
            hour+=24;
        }
        System.out.println(hour + " " + a);
        sc.close();
    }
}
