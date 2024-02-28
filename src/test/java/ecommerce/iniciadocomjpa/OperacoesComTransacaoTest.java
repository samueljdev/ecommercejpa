package ecommerce.iniciadocomjpa;

import ecommerce.EntityManagerTest;
import org.example.model.Produto;
import org.junit.Test;

public class OperacoesComTransacaoTest extends EntityManagerTest {

    @Test
    public void abrirEFecharATransacao() {
        Produto produto = new Produto(); // somente para o metodo ñ mostrar erros

        entityManager.getTransaction().begin();

        entityManager.persist(produto);
        entityManager.merge(produto);
        entityManager.remove(produto);

        entityManager.getTransaction().commit();
    }

}
