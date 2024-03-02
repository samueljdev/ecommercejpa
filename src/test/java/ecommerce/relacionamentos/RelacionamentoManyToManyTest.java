package ecommerce.relacionamentos;

import ecommerce.EntityManagerTest;
import org.example.model.Categoria;
import org.example.model.Produto;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RelacionamentoManyToManyTest extends EntityManagerTest {
    @Test
    public void verificarRelacionamento() {
        Produto produto = entityManager.find(Produto.class, 1);
        Categoria categoria = entityManager.find(Categoria.class, 1);

        entityManager.getTransaction().begin();
        produto.setCategorias(Arrays.asList(categoria));
        entityManager.getTransaction().commit();

        entityManager.clear();

        Categoria categoriaVerificacao = entityManager.find(Categoria.class, categoria.getId());
        Assert.assertFalse(categoriaVerificacao.getProdutos().isEmpty());
    }
}
