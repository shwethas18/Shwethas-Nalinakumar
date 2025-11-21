import java.util.Scanner;
class Calculation{
    public double calculate(double a,double b,String op){
        switch (op.toLowerCase()){
            case "add":return a+b;
            case "sub":return a-b;
            case "mul":return a*b;
            case "div":if (b==0){
                           System.out.println("division by zero is an error");
                           return 0;
                       }
                       else {
                           return a/b;
                       }
            default: System.out.println("choose correct operation");
            return 0;
        }
    }
}
public class Problem1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        double a=sc.nextDouble();
        System.out.println("enter next number");
        double b=sc.nextDouble();
        System.out.println("enter which operation add,sub,mul,div");
        String op=sc.next();
        Calculation calc=new Calculation();
        double result=calc.calculate(a,b,op);
        System.out.println("Result:"+result);
        sc.close();
    }
}