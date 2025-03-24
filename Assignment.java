import java.util.Scanner;
class Assignment{
	public static void main(String...args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = 22;
	//System.out.println(a==b);
	System.out.println(a+=b);
	System.out.println(a-=b);
	System.out.println(a*=b);
	System.out.println(a/=b);
	System.out.println(a%=b);
	
	}
}