import java.util.Scanner;

public class Que_02 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number.");
        int num=sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++)
        {
            if(i<=num && i%2!=0)
                sum+=i;
        }
        System.out.println(sum);
    }
}
