package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicios-jpa"); //cria um entity manager especifico
        //ele deve ser usado para criar instancias de um EntityManager

        EntityManager em = emf.createEntityManager();
        //Um EntityManager mapeia um conjunto de classes a um banco de dados particular.
        // Este conjunto de classes é chamado de persistence unit (unidade de persistência).

        Usuario novoUser = new Usuario("Juliano", "reijulian@gmail.com");

        em.getTransaction().begin();
        em.persist(novoUser); //o persist gera um insert
        em.getTransaction().commit();

        System.out.println("O Id gerado foi: " + novoUser.getId());

        em.close();
        emf.close();

    }
}
