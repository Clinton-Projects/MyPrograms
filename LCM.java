import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First Number :");
        int no1=input.nextInt();
        System.out.println("Enter Second Number :");
        int no2=input.nextInt();
        int max=no1>no2?no1:no2;
        int i=2;
        while(i<max){
        if((no1/i==0)&&( no2/i==0))
        System.out.println("The LCM is "+i); 
        }
    }
}
