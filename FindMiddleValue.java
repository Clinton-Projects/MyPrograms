import java.util.Arrays;
public class FindMiddleValue{
    public static void main(String[] args){
        //find middle value
        int[] arr={20,60,40,30,70,60,70,40,10};
        System.out.println("Given Array is : "+Arrays.toString(arr));
        int middleValue=arr.length/2;
        System.out.println("Array Middle value is: "+arr[middleValue]);
    }
}