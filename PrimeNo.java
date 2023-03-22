import java.util.Scanner;
public class PrimeNo {
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner input=new Scanner(System.in);
        int no=input.nextInt();
        int i=2;
        boolean prime=true;
        while(i<no){
            if(no%i==0){
            System.out.println(no+" Is not a Prime");
            prime=false;
            
            break;
            }i++;
        }
            if(prime==true)
            System.out.println(no+" Is a prime ");
        
    }
}
