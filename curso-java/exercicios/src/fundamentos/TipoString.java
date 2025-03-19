package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(0));
		String s = "Boa tarde";
		System.out.println(s.concat("!!!")); 
		System.out.println(s + "!!!"); //concatenar a string com "!!!"
		System.out.println(s.startsWith("Boa")); //saber se começa com "Boa"
		System.out.println(s.toLowerCase().startsWith("boa")); //agora com "boa"
		System.out.println(s.length()); //saber quantos caracteres tem a string
		System.out.println(s.endsWith("tarde")); //termina com "tarde"
		System.out.println(s.toUpperCase().endsWith("TARDE")); //termina com "tarde" maiúsculo
		System.out.println(s.equals("boa tarde")); //comparar igualdades
		System.out.println(s.equalsIgnoreCase("boa tarde")); //comparar igualdades ignorando letras maiúsculas e minúsculas
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario + "\n\n");
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
	}

}
