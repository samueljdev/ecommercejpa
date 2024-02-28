package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PagamentoBoleto {
    @Id
    @EqualsAndHashCode.Include
    private Long id;
    private Integer pedido_id;
    private StatusPagamento statusPagamento;
    private String codigoBarras;
}
