import java.util.Scanner;
class findSqureRoot{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int no=input.nextInt();
        int i=2;
        while(i<no/2){
            if(no/i==i){
                System.out.println(no+" The Squre Root of "+i);
                break;
            }
            i++;
        }
    
    } 
}