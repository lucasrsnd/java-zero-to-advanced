package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ObterUsuario {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario findUsuario = em.find(Usuario.class, 6L);
        System.out.println("O usuário encontrado foi: " + findUsuario.getNome());

        em.close();
        emf.close();
    }
}
