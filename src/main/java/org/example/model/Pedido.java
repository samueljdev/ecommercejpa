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
public class Pedido {
    @Id
    @EqualsAndHashCode.Include
    private Long id;
    private LocalDateTime dataPedido;
    private LocalDateTime dataConclusao;
    private Integer notafiscal_id;
    private StatusPedido statusPedido;
    private BigDecimal total;
}
