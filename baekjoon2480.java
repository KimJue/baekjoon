import java.util.Scanner;

public class baekjoon2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        int money = 0;

        if(a==b && b==c) //같은 눈이 3개인 경우
        {
            money = 10000 + a * 1000;
        }
        else if(a==b || b==c || c==a) //같은 눈이 2개인 경우
        {
            if(a==b)
            {
                money = 1000+ a * 100;
            }
            else
            {
                money = 1000 + c* 100;
            }
        }
        else // 같은 눈이 없을 경우
        {
            money = Math.max(Math.max(a,b),c) * 100;
        }
        System.out.println(money);
        sc.close();
    }
}
