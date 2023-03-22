public class FactorialUseRecursion {
    // recursion use factorial this program
    //recursion is one method kulla athey method aah theruppi call panrathu thaan
    static int fact(int n){
        if(n==0)
        return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args){
        int n=5;
        System.out.println(fact(n));
        //this is normal factorial
        int rial=n;
        while(n>1){
            n--;
            rial=rial*n;
        }
        System.out.println(rial);
    }    

}

    

