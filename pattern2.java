import java.util.Scanner;
public class pattern2{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of stars to be printed:");
	int n=sc.nextInt();
	for(int i=0;i<n;i++){
	for(int j=0;j<n;j++){
	if (j==0 || i==0)
	System.out.print("*");
	}System.out.print("\n");
	}
	}
}