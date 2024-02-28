package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PagamentoCartao {
    @Id
    @EqualsAndHashCode.Include
    private Long id;
    private Integer pedido_id;
    private StatusPagamento statusPagamento;
    private String numero;
}
