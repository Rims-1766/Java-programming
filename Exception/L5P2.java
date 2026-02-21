import java.util.Scanner;
import java.io.*;

class AgeException extends Exception {
	AgeException(String message){
		
		super(message);
	}
 }
public class L5P2{
	public static void main(String...args)throws AgeException{
		Scanner sc = new Scanner(System.in);
		int age=sc.nextInt();
		if(age<18){
			throw new AgeException("youre not eleigible for vote");
		}
		else{
			System.out.println("you can vote");
		}
	}
}