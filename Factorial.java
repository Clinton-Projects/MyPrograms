import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int no=input.nextInt();
        int fact=1;
        while(no>0){
            fact=fact*no;
            no--;
        }
        System.out.println(" Given Number  Factorial Value is "+fact);
    }
}
