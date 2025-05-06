package excecao;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println(7/ sc.nextInt());
            //se coloca o close aqui e entra na excecao, ele nao é executado
        }catch (Exception e){
            System.out.println(e.getMessage());
        } finally{
            sc.close();
        }

        System.out.println("Fim");
    }
}