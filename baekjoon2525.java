import java.util.Scanner;

public class baekjoon2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();
        int timer = sc.nextInt();

        int end_hour = hour + (timer/60);
        int end_min = min + (timer%60);

        if(end_min >= 60)
        {
            end_hour += (end_min/60);
            end_min %= 60;
        }
        if(end_hour>=24)
        {
            end_hour %= 24;
        }
        System.out.println(end_hour + " " + end_min);
        sc.close();
    }
}
