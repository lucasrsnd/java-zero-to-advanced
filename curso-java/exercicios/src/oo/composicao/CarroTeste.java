package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		System.out.println(c1.estaLigado());
		
		c1.ligar();
		System.out.println(c1.estaLigado());
		
		System.out.println(c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println(c1.motor.giros());
		
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
		
		System.out.println(c1.motor.giros());
		
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
		
		// FALTOU ENCAPSULAMENTO!!!
		// c1.motor.fatorInjecao = -30;
		
		System.out.println(c1.motor.giros());
		
		// RELAÇÃO BIDIRECIONAL
		System.out.println(c1.motor.carro.motor.carro.motor.giros());
	}
}
