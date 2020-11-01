package pp;



interface HelloWorld {
	void hello(int a,int b);
}

class HC {

	public static void main(String args[]) {
		int n = 30; 
		HelloWorld hw = (var a,var b) -> System.out.println("additioon is   "+ (a+b));
		hw.hello(20,30);
	}

}