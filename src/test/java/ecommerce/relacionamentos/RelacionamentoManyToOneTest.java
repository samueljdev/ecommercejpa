package ecommerce.relacionamentos;

import ecommerce.EntityManagerTest;
import org.example.model.Cliente;
import org.example.model.EnderecoEntregaPedido;
import org.example.model.Pedido;
import org.example.model.StatusPedido;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class RelacionamentoManyToOneTest extends EntityManagerTest {

    @Test
    public void verificarRelacionamento() {
        Cliente cliente = entityManager.find(Cliente.class, 1);

        EnderecoEntregaPedido entregaPedido = new EnderecoEntregaPedido();
        entregaPedido.setCep("11010010");
        entregaPedido.setNumero("32");
        entregaPedido.setBairro("Coroado");
        entregaPedido.setCidade("Manaus");
        entregaPedido.setLogradouro("R. Astro barroso");
        entregaPedido.setComplemento("Residencia");
        entregaPedido.setEstado("AM");

        Pedido pedido = new Pedido();
        pedido.setStatus(StatusPedido.AGUARDANDO);
        pedido.setDataPedido(LocalDateTime.now());
        pedido.setTotal(BigDecimal.TEN);
        pedido.setEnderecoEntrega(entregaPedido);
        pedido.setCliente(cliente);

        entityManager.getTransaction().begin();
        entityManager.persist(pedido);
        entityManager.getTransaction().commit();
        entityManager.clear();

        Pedido pedidoVerificacao = entityManager.find(Pedido.class, pedido.getId());
        Assert.assertNotNull(pedidoVerificacao.getCliente());
    }

}
