package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {

		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase(); //fazer que a string seja toda convertida para letra maiúscula
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Lucas".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X".replace("X", "Gui");
		y = y.toUpperCase();
		y = y.concat("!!!");
		System.out.println(y);
		
		//tipos primitivos não tem o operador "."
		int a = 3;
		System.out.println(a);
	}
}