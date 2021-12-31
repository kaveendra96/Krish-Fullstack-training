class Blocks {
	
	public static final int id ;
	public static final String name = "Nipun";
	
	static {
		id =10;
		System.out.println("Static block");
		
	}
	public Blocks(){
		System.out.println("constructor");
	}
	
	{
		System.out.println("block");
	}
	
	public static void main(String args[]){
		System.out.println("main method");
		Blocks block = new Blocks();
	}


}
