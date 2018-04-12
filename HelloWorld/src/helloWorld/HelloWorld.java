package helloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		int [] anz = {1, 3, 5};
		System.out.println("Hello");
		
		for(int i : anz) {
			System.out.println("Zahl: "+i);
		}

		System.out.println("Progamm beendet");
	}

}
