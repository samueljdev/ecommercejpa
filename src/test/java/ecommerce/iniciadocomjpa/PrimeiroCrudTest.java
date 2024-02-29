package ecommerce.iniciadocomjpa;

import ecommerce.EntityManagerTest;
import org.example.model.Cliente;
import org.example.model.SexoCliente;
import org.junit.Assert;
import org.junit.Test;

public class PrimeiroCrudTest extends EntityManagerTest {
    @Test
    public void inserirRegistro() {
        Cliente cliente = new Cliente();
        cliente.setNome("Cintia Santos");
        cliente.setSexo(SexoCliente.FEMININO);

        entityManager.getTransaction().begin();
        entityManager.persist(cliente);
        entityManager.getTransaction().commit();
        entityManager.clear();

        Cliente clinteVerificacao = entityManager.find(Cliente.class, cliente.getId());
        Assert.assertNotNull(clinteVerificacao);
    }

    @Test
    public void busarPorIdentificador() {
        Cliente clinteVerificacao = entityManager.find(Cliente.class, 1);

        Assert.assertNotNull(clinteVerificacao);
        Assert.assertEquals("Fernanda Lemos", clinteVerificacao.getNome());
    }

    @Test
    public void atualizarRegistro() {
        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setNome("Fernanda Lemos");
        cliente.setSexo(SexoCliente.FEMININO);

        entityManager.getTransaction().begin();
        entityManager.merge(cliente);
        entityManager.getTransaction().commit();
        entityManager.clear();

        Cliente clienteVerificacao = entityManager.find(Cliente.class, cliente.getId());
        Assert.assertEquals("Fernanda Lemos", clienteVerificacao.getNome());
    }

    @Test
    public void removerRegistro() {
        Cliente cliente = entityManager.find(Cliente.class, 1);

        entityManager.getTransaction().begin();
        entityManager.remove(cliente);
        entityManager.getTransaction().commit();
        entityManager.clear();

        Cliente clienteVerificacao = entityManager.find(Cliente.class, cliente.getId());
        Assert.assertNull(clienteVerificacao);
    }

}
