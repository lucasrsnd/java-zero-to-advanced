package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.*;

public class AlterarUsuario1 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Usuario usuario = em.find(Usuario.class, 6L);
        usuario.setNome("Juliano");
        usuario.setEmail("reijulian@lanches.com.br");
        //o merge é responsavel por pegar um usuario que ja
        //esta no banco e fazer uma alteracao nele
        em.merge(usuario);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
