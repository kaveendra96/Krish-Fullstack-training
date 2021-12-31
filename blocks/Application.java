class Test{
	public static int id;
}
class Application {
	public void method(){
		int x = 10;
		Test.id = x;
		Test t = new Test();
		t.id = 20;
		System.out.println(Test.id);
		System.out.println(t.id);
		t = null;
		System.out.println(t.id);
	
	}
	
	public static void main(String args[]){
		Application app = new Application();
		app.method();
	
	}

}
