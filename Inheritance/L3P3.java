class Animalmain(){
	public static void main(String...args){
		Animal obj=new Animal();
		obj.Animal();
		obj.makesound();
	}
		
}
class Animal{
	public static void makesound(){
		System.out.println("Animals make sounds");

	}
}
public class cat extends makesound{
		@Override
		public void makesound(){
			System.out.println("the cat is murmuring");
			super.makesound();
		}
}
