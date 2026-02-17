import java.util.Scanner;
 class arraysort{
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int []a=new int[size];
		
		for(int i=0;i < size;i++)
			a[i]= s.nextInt();

		for(int x : a)
			System.out.print(x + " ");

		for(int i=0;i < a.length;i++){
			int he = a[i];
			
			for(int j = 0; j < a.length ;j++){
				if(he < a[j]){
					a[i]= a[j];
					a[j]= he;
					he = a[i];
				}
			}

		}
		System.out.println("");

		for(int x : a)
			System.out.print(x + " ");

	}
}
