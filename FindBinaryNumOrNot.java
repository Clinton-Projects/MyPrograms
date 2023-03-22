public class FindBinaryNumOrNot {
    public static void main(String[] args){
        int num=1111;
        boolean check =true;
        int value=0;
        while(num>0){
            value=num%10;
            num/=10;
            if(value>1)
            check=false;
        }
        if(check==true){
            System.out.println("It is Binary Code");
        }
        else{
            System.out.println("It is Not Binary  Code");
        }
    }
}
