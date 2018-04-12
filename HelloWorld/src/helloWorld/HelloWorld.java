package helloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		int [] anz = {1, 3, 5};
		int sum = 0;
		System.out.println("Hello");
		
		for(int i : anz) {
			System.out.println("Zahl: "+i);
			sum=sum+i;
		}

		System.out.println("Progamm beendet");
		System.out.println("Summe: "+sum);
	}
	

}
