import java.lang.reflect.Method;
import java.lang.annotation.*;

class L5P3{
		@Bullet(str= "Hello" , dble= 13.24)

		public static void anyMethod() throws NoSuchMethodException{
			Method mtd =L5P3.class.getMethod("anyMethod");
			Bullet b=mtd.getAnnotation(Bullet.class);
			System.out.println("String.."+b.str());
			System.out.println("Double.."+b.dble());
		}
	
	public static void main(String...args) throws NoSuchMethodException{
		
		anyMethod();
	}
}