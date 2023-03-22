import java.util.*;
public class OnlyNumCheck{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any  value: ");
        String word=input.nextLine();
        boolean check=true;
        for(int i=0;i<word.length();i++){
            int vl=word.charAt(i);
            
        if(48>vl || 57<vl){
            check=false;
            break;
        }
        }
        if(check==true)
        System.out.println("Given value is Number is Only");
        else
            System.out.println("Given value is char or number char mixed");
        
        

    }
}