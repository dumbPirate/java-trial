package first;

public class Fibonacci {
    public static void main(String[] args){
    	int n = 10, t1 = 0, t2 = 1, sum;
    	for(int i = 1; i<=n; i++) {
    		System.out.println(t1);
    		sum = t1 + t2;
    		t1 = t2;
    		t2 = sum;
    	}   	
//        int n = 10, t1 = 0, t2 = 1;
//        System.out.print("First " + n + " terms: ");
//        for (int i = 1; i <= n; ++i){
//            System.out.print(t1 + " + ");
//            int sum = t1 + t2;
//            t1 = t2;
//            t2 = sum;
//        }
    }
}
