import java.util.*;
public class ArrayDublicateElement{
    public static void main(String[] args){
        int[] arr={10,30,40,30,50,60,30,50,60,80,20,40,20,90};
        int[] temp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=1;
            int no=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(no==arr[j]){
                    count++;
                    temp[j]=-1;

                }
            }
            if(temp[i]!=-1){
                temp[i]=count;
            }
        }
        System.out.println(Arrays.toString(temp));

        //Below Six Line code is Find Unique Element Code

        System.out.println("print Unique element: ");
        for(int i=0;i<temp.length;i++){
            if(1==temp[i]){
                System.out.println(arr[i]);
            }
        }
        //Below Six Line code is Find How many times repeated Element Code

        System.out.println("Print No and count of dublecate element : ");
        for(int i=0;i<temp.length;i++){
            if(temp[i]>=1){
                System.out.println(arr[i]+" is " +temp[i] +" times ");
            }
        }
        //Below Six Line code is Find Dublecate Element Code
        System.out.println("Dublecate element is : ");
        for(int i=0;i<temp.length;i++){
            if(temp[i]>1){
                System.out.print(arr[i]+" ");
            }
        }
    }
}