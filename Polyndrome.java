import java.util.*;
public class Polyndrome{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the word: ");

        String word=input.nextLine();
        String ans="";
        for(int i=word.length()-1;i>=0;i--){
            ans=ans+word.charAt(i);     
        }
        if(word.equals(ans))
        System.out.println(word+" is polyndrome");
        else
        System.out.println(word+" is not polyndrome");
    }
}