package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		double Raio = 3.4;
		final double Pi = 3.14159;
		
		double area = Pi * Raio * Raio;
		System.out.println(area);
		
		Raio = 10;
		area = Pi * Raio * Raio;
		System.out.println("Área = " + area + "m2.");
	}
}
