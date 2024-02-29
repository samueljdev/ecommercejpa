package org.example.model;

import jakarta.persistence.*;
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
@Table(name = "tb_pedido")
public class Pedido {
    @Id
    @EqualsAndHashCode.Include
    private Integer id;

    @Column(name = "data_pedido")
    private LocalDateTime dataPedido;

    @Column(name = "data_conclusao")
    private LocalDateTime dataConclusao;

    @Column(name = "notafiscal_id")
    private Integer notafiscal_id;

    @Enumerated(EnumType.STRING)
    private StatusPedido statusPedido;

    private BigDecimal total;
}
