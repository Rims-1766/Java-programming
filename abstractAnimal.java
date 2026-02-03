abstract  class Animal{
	abstract public  void sound();

}
class Tiger extends Animal{
	public void sound(){
		System.out.println("tiger makes sound");
	}
}
abstract class Lion extends Tiger{
	abstract public void behave();
}
class Animalmain2{
	@Override
	public void behave(){
		System.out.println("tiger jump");
	}
	@Override
	public void sound(){
		System.out.println("tiger is angry");
	}
	public static void main(String...args){
		System.out.println("Tiger class");
		
	}
}
