public class Animalmain{
	public static void main(String...args){
		Animal obj=new Animal();
		
		obj.makesound();
	}
		
}
class Animal{
	public  void makesound(){
		System.out.println("Animals make sounds");

	}
}
 class cat extends Animal{
		@Override
		public void makesound(){
			System.out.println("the cat is murmuring");
			//super.makesound();
		}
}


