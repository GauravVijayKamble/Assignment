import java.util.Scanner;
public class Que_05 {

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the Integer.");
            int num=sc.nextInt();
            int sum=0;
            int num1=0,num2=1;
            while(num>0)
            {
                sum=num1 + num2;
                num1 = num2;
                num2 = sum;

                num--;
                //System.out.println(num1+" "+num2);
            }
            System.out.println(sum);

        }

    }
