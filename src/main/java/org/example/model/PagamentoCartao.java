package org.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "tb_pagamento_cartao")
public class PagamentoCartao {
    @Id
    @EqualsAndHashCode.Include
    private Long id;

    @Column(name = "pedido_id")
    private Integer pedido_id;

    @Column(name = "status_pagamento")
    private StatusPagamento statusPagamento;

    private String numero;
}
