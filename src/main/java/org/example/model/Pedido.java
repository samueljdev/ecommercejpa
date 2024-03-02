package org.example.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "tb_pedido")
public class Pedido {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToMany(mappedBy = "pedido")
    private List<ItemPedido> itens;

    @OneToOne(mappedBy = "pedido")
    private NotaFiscal notafiscal;

    @OneToOne(mappedBy = "pedido")
    private PagamentoCartao pagamentoCartao;

    @OneToOne(mappedBy = "pedido")
    private PagamentoBoleto pagamentoBoleto;

    @Embedded
    private EnderecoEntregaPedido enderecoEntrega;

    @Enumerated(EnumType.STRING)
    private StatusPedido status;

    @Column(name = "data_pedido")
    private LocalDateTime dataPedido;

    @Column(name = "data_conclusao")
    private LocalDateTime dataConclusao;

    private BigDecimal total;
}
