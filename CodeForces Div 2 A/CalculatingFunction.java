import java.util.Scanner;

public class CalculatingFunction{
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long sum=0;
        if(n%2==0)
        sum =n/2;
        else
        sum=(-1)*(n/2+1);
       
        System.out.println(sum);
        sc.close();
    }
}