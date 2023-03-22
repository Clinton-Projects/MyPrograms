import java.util.*;
public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word=input.nextLine();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            boolean repeat=false;
            for(int j=i+1;j<word.length();j++){
                if(ch==word.charAt(j)){
                    repeat=true;
                    ch=word.charAt(j);
                    break;
                
                }
            }
            if(repeat==false){
                System.out.println(ch+" is First not repeated character");
                break;
            }
        }

    }
}
