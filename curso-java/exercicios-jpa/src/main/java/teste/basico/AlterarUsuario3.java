package teste.basico;
import modelo.basico.Usuario;
import javax.persistence.*;

public class AlterarUsuario3 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Usuario usuario = em.find(Usuario.class, 6L);
        em.detach(usuario); //deixa o objeto no estado nao-gerenciado
        //(agr vc so pode fazer mudancas lancando o merge)

        usuario.setNome("Juliano Leitao");

        em.merge(usuario);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
