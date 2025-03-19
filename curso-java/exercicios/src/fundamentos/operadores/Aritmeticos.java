package fundamentos.operadores;

public class Aritmeticos {

	public static void main(String[] args) {
		
		System.out.println(2 + 3);
		
		//"var" o próprio java reconhece que o valor de x é double
		//double os resultados são quebrados
		var x = 34.56;
		double y = 2.2;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		//no int os resultados vão ser inteiros
		int a = 8;
		int b = 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b); //para converter um int para double
		System.out.println(a / (float) b); //para converter um int para float, note que float tem uma precisão menor
		
		//módulo = resto da divisão
		System.out.println(8 % 3);
		System.out.println(a % b);
		
		//com várias operações, tem uma precedência, então a multiplicação vem primeiro
		System.out.println(x + y - a * b);
	}
}
