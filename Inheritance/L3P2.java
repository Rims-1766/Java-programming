class  L3P2 extends L3P1{
			static int  neu;

	public static void  display(){
		
			System.out.println(view+neu);
		}
	@Override
	public int show(){
		return(neu + view);
	}

	public void pearl(){
		
		System.out.println("Hyy L3P2 child of L3P1");
		
	}
	
	public static void main(String...args){
		
		
		L3P2 obj = new L3P2();
		obj.show();
		obj.pearl();

	}

		
}
