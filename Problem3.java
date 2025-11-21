import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a= sc.nextInt();
        int limit=0;
        if (a%2==0){
            limit=2*a-3;
        }
        else{
            limit=2*a-1;
        }
        for (int i = 1; i <=limit; i+=2) {
            System.out.print(i+" ");
        }
    }
}