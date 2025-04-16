package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

    public static void main(String[] args) {

        Civic c1 = new Civic();

        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);

        Ferrari f1 = new Ferrari(400);

        f1.acelerar();
        f1.frear();
        System.out.println(f1);

        f1.acelerar();
        f1.frear();
        System.out.println(f1);

        f1.acelerar();
        System.out.println(f1);
    }
}
