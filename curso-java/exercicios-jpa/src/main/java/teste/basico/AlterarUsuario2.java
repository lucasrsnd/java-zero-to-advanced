package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.*;

public class AlterarUsuario2 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Usuario usuario = em.find(Usuario.class, 6L);
        usuario.setNome("Juliano Alterado");

        //em.merge(usuario);

        em.getTransaction().commit();
//isso ainda funciona pq o objeto esta no estado gerenciado
        em.close();
        emf.close();
    }
}
