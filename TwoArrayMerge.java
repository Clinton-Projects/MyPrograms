import java.util.Arrays;

public class TwoArrayMerge{
    public static void main(String[] args) {

        int[] ar1={10,20,30,40,50};
        int[] ar2={10,20,30,50,60,70};

        System.out.println("first array is: \n"+Arrays.toString(ar1));
        System.out.println("second array is: \n"+Arrays.toString(ar2));
        //Mearge two arrays 
        int[] ar3=new int[ar1.length+ar2.length];
        for(int i=0;i<ar1.length;i++){
            ar3[i]=ar1[i];
        }
        for(int j=0,len=ar1.length;j<ar2.length;j++,len++){
            ar3[len]=ar2[j];   
        }
        System.out.println("mearge two array is: \n"+Arrays.toString(ar3));    
        //array sorted in ascennding order
        System.out.println("sorted two arrays:");   


        
        
        
    }
}