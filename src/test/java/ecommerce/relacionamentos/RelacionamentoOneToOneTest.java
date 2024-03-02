package ecommerce.relacionamentos;

import ecommerce.EntityManagerTest;
import org.example.model.PagamentoCartao;
import org.example.model.Pedido;
import org.example.model.StatusPagamento;
import org.junit.Assert;
import org.junit.Test;

public class RelacionamentoOneToOneTest extends EntityManagerTest {
    @Test
    public void verificarRelacionamento() {
        Pedido pedido = entityManager.find(Pedido.class, 1);

        PagamentoCartao pagamentoCartao = new PagamentoCartao();
        pagamentoCartao.setNumero("1234");
        pagamentoCartao.setStatus(StatusPagamento.PROCESSANDO);
        pagamentoCartao.setPedido(pedido);

        entityManager.getTransaction().begin();
        entityManager.persist(pagamentoCartao);
        entityManager.getTransaction().commit();

        entityManager.clear();

        Pedido pedidoVerificacao = entityManager.find(Pedido.class, pedido.getId());
        Assert.assertNotNull(pedidoVerificacao.getPagamentoCartao());
    }
}
