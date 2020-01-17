package first;

//import java.util.Scanner;
class NumberIntoWorld{
public static void main(String args[])
{
//Scanner sc=new Scanner(System.in);
//System.out.println("Enter the number");
int n = 5999;
nw(n/10000000," crore");
nw(n/100000%1000," Lakhs");
nw(n/1000%100," Thousand");
nw(n/100%10," Hundred");
nw(n%100,"");
}
static void nw(int n, String st)
{
String one[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","tweleve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
String two[]={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};

if(n<20)
System.out.print(one[n]);
else
System.out.print(two[n/10] + one[n%10]);

if(n!=0)
System.out.print(st +" ");
}
}