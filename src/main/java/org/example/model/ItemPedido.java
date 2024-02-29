package org.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "tb_item_pedido")
public class ItemPedido {
    @Id
    @EqualsAndHashCode.Include
    private Long id;

    @Column(name = "pedido_id")
    private Integer pedido_id;

    @Column(name = "produto_id")
    private Integer produto_id;

    @Column(name = "preco_produto")
    private BigDecimal precoProduto;

    private Integer quantidade;
}
