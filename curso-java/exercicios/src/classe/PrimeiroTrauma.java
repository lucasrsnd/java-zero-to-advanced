package classe;

public class PrimeiroTrauma {

	int a = 3; // não pode mexer aqui!
	static int b = 4; // <- segunda forma
	
	public static void main(String[] args) {
	
		// forma 1:
		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.a);
		
		System.out.println(b);
	}
}
