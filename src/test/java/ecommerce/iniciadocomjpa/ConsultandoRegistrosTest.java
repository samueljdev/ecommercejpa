package ecommerce.iniciadocomjpa;

import ecommerce.EntityManagerTest;
import org.example.model.Produto;
import org.junit.Assert;
import org.junit.Test;

public class ConsultandoRegistrosTest extends EntityManagerTest {

    @Test
    public void busarPorIdentificador() {
        Produto produto = entityManager.find(Produto.class, 1);
        System.out.println(">>>>> Sempre faz o SQL");
        Assert.assertNotNull(produto);
        Assert.assertEquals("Kindle", produto.getNome());
    }

    @Test
    public void busarPorGetReference() {
        Produto produto = entityManager.getReference(Produto.class, 1);
        System.out.println(">>>>> Ainda não fez o SQL");
        Assert.assertNotNull(produto);
        Assert.assertEquals("Kindle", produto.getNome());
        System.out.println(">>>>> Já fez o SQL");
    }

    @Test
    public void atualizarAReferencia() {
        Produto produto = entityManager.find(Produto.class, 1);
        produto.setNome("Microfone Samson");

        entityManager.refresh(produto);

        Assert.assertNotNull(produto);
        Assert.assertEquals("Kindle", produto.getNome());
    }
}
