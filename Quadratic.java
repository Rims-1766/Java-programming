import java.util.Scanner;
class Quadratic{
	public static void main(String...args){
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	double x=Math.sqrt(b*b-4*a*c);
	if(x > 0){
		System.out.println((-b+x)/(2*a));
	}else if(x < 0){
		System.out.println((-b-x)/(2*a));
	}else{
		System.out.println("roots are equal");
	}
    }		
}