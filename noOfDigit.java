import java.util.Scanner;
class noOfDigit{
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int no=input.nextInt(); 
        int count=0;
        while(no>0){
            count++;
            no=no/10;  
        }
        System.out.println(count+" digit of the number");
    }
}