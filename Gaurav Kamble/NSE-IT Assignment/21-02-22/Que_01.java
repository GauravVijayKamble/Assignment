import java.util.Scanner;
public class Que_01 {
    public static void main(String[] args) {

            Scanner sc= new Scanner(System.in);
            int[] arr= {10,15,20,25,30,100};
            System.out.println("Enter the Number.");
            int num=sc.nextInt();
            int sum=getSum(arr,num);

            int rev=getReverse(sum);
            System.out.println(rev);
    
        }
        public static int getSum(int[] arr,int num)
        {
            int sum=0;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]>num)
                {
                    sum=sum+arr[i];
                }
            }
            return sum;
        }
        public static int getReverse(int num)
        {
            int sum=0;
            while(num>0)
            {
                int rem=num%10;
                sum=sum*10+rem;
                num/=10;
            }
            return sum;
        }

    }
