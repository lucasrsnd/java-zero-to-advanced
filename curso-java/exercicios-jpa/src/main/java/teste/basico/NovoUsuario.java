package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicios-jpa");

        EntityManager em = emf.createEntityManager();
        Usuario novoUser = new Usuario("Juliano", "reijulian@gmail.com");

        em.getTransaction().begin();
        em.persist(novoUser);
        em.getTransaction().commit();

        System.out.println("O Id gerado foi: " + novoUser.getId());

        em.close();
        emf.close();

    }
}
