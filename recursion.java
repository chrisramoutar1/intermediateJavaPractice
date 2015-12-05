//all recursion is, is a method that calls itself
public class recursion {
    //public static void main(String args[]){
        System.out.println(fact(5));
    }
    
    
    
    
    
    public static long fact(long n){
        if(n <= 1)
            return 1;
        else
            return n * fact(n-1);
        //this is factorial, keeps calling itself until it equals 1.
        
    }


    
}
