package first;

public class Palindrome {
	public static void main(String args[]){
		long n = 44122144;
		String s = ""+ n;
		System.out.println(s.length());
		for(int i = 0;i<s.length()/2;i++) {
			if (s.charAt(i)!=s.charAt(s.length()-i-1)){
				System.out.println("n");
				break;
			}
			else if(i==s.length()/2-1) {
				System.out.println("y");
			}
		}
		
		
		
		
//		int r,sum=0,temp;    
//		int n=456;
//		temp=n;
//		while(n>0){
//			r=n%10;
//			sum=(sum*10)+r;    
//			n=n/10;    
//		}    
//		if(temp==sum)
//			System.out.println("palindrome number ");    
//		else    
//			System.out.println("not palindrome");    
	}
}