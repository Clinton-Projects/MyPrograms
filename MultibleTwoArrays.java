import java.util.Arrays;
public class MultibleTwoArrays {
    public static void main (String[] args){
        int[] a={2,4,6};
        int[] b={5,2,3};
        //  int z=(a.length<b.length)?"small":"big";
        int[] c=new int[a.length];
        
        for( int i=0;i<a.length;i++){
            c[i]=a[i]*b[i];
        }
        
        for(int j=0;j<c.length;j++){
        System.out.println(c[j]);
        }
    }
}
