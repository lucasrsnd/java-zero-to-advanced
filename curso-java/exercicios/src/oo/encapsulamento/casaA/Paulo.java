package oo.encapsulamento.casaA;

public class Paulo {

    Ana esposa = new Ana();

    void testeAcessos() {
        // System.out.println(esposa.segredo); // NAO CONSIGO VER POIS E ALGO PRIVADO
        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.todosSabem);
    }
}
