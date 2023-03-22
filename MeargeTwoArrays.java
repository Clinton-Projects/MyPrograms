import java.util.Arrays;
public class MeargeTwoArrays{
    public static void main(String[] args){
        int[] a={10,20,30,40,50};
        int[] b={60,70,80,90};
        int d=a.length+b.length;
        int[] c=new int[d];

        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }

        int z=0;
        for(int j=a.length;j<c.length;j++){
            c[j]=b[z];
            z++;
        }
        System.out.println("Mearge Two Arrays are:" +Arrays.toString(c));
        
    }
}
