package first;

public class ReverseString {
	public static void main(String[] args){
//		String grt = "123456789";
//	    StringBuilder rev=new StringBuilder("1234  56789");  
//	    rev.reverse();
		
		char[] ch = "123456".toCharArray();
		String s = "";
		for(int i= ch.length-1;i>=0;i--) {
			s += ch[i];
		}
//		
	    System.out.println(s);
	} 
}
