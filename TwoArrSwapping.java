import java.util.Arrays;
public class TwoArrSwapping{
    public static void main(String[] args){
        //Two Arrays Swapping
        int[] num1={1,3,5};
        int[] num2={2,4,6};
        System.out.println("Before swapping one :"+Arrays.toString(num1));
        System.out.println("Before Swapping two :"+Arrays.toString(num2));
        int[] temp=new int[num1.length];
        for(int i=0;i<num1.length;i++){
            temp[i]=num1[i];
            num1[i]=num2[i];
            num2[i]=temp[i];
        }
        System.out.println("Arrays one : "+Arrays.toString(num1));
        System.out.println("Arrays two : "+Arrays.toString(num2));
        
        
    }
}