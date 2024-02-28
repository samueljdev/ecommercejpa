package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ItemPedido {
    @Id
    @EqualsAndHashCode.Include
    private Long id;
    private Integer pedido_id;
    private Integer produto_id;
    private BigDecimal precoProduto;
    private Integer quantidade;
}
