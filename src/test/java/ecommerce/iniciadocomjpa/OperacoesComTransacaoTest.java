package ecommerce.iniciadocomjpa;

import ecommerce.EntityManagerTest;
import org.example.model.Produto;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class OperacoesComTransacaoTest extends EntityManagerTest {
    @Test
    public void atualizarObjeto() {
        Produto produto = new Produto();

        produto.setId(1);
        produto.setNome("Kindle Paperwhite");
        produto.setDescricao("Conheça o novo Kindle.");
        produto.setPreco(new BigDecimal(799));

        entityManager.getTransaction().begin();
        entityManager.merge(produto);
        entityManager.getTransaction().commit();

        entityManager.clear();

        Produto produtoVerificacao = entityManager.find(Produto.class, produto.getId());
        Assert.assertNotNull(produtoVerificacao); // afirmo que NÃO é nullo
        Assert.assertEquals("Kindle Paperwhite", produtoVerificacao.getNome());
    }

    @Test
    public void removerObjeto() {
        Produto produto = entityManager.find(Produto.class, 3);

        entityManager.getTransaction().begin();
        entityManager.remove(produto);
        entityManager.getTransaction().commit();

//        entityManager.clear(); Não é necessário na asserção para operação de remoção.

        Produto produtoVerificacao = entityManager.find(Produto.class, 3);
        Assert.assertNull(produtoVerificacao); // afirmo que é nullo
    }

    @Test
    public void inserirOPrimeiroObjeto() {
        Produto produto = new Produto();
        produto.setId(2);
        produto.setNome("Câmera Canon");
        produto.setDescricao("A melhor definição para sua foto");
        produto.setPreco(new BigDecimal(5000.0));

        // fazendo inserção de registro na base
        entityManager.getTransaction().begin(); // abrindo transação com o BD
        entityManager.persist(produto); // persistindo objeto no BD
        entityManager.getTransaction().commit();

        entityManager.clear(); // limpando dados na memoria do entityManager

        Produto produtoVerificacao = entityManager.find(Produto.class, produto.getId());  // fazendo select no BD
        Assert.assertNotNull(produtoVerificacao);
    }

    @Test
    public void abrirEFecharATransacao() {
        Produto produto = new Produto(); // somente para o metodo ñ mostrar erros

        entityManager.getTransaction().begin();

//        entityManager.persist(produto);
//        entityManager.merge(produto);
//        entityManager.remove(produto);

        entityManager.getTransaction().commit();
    }

}
