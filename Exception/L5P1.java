import java.util.Scanner;
import java.io.*;

public class  L5P1{
	public static void main(	String...args)throws AgeException{
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try{
			if(age<18){
				throw new AgeException("sorry!You're not eligible for vote");
			}
			else{
				System.out.println("You can vote!!");
			}
		}catch(AgeException ae){
				System.out.println(ae.getMessage());
		}
	}
}
class AgeException extends Exception{
	AgeException(String message){
		
		super(message);
	}
 }
