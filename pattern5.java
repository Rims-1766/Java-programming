import java.util.Scanner;
public class pattern5{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n = sc.nextInt();
	for(int i=0;i<n*2;i++){
	for(int j=0;j<n;j++){
	System.out.print("*");
	}System.out.print("\n");
	}
	}
}