package org.example.model;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "pedido_id")
    private Integer pedido;

    @Enumerated(EnumType.STRING)
    private StatusPagamento status;

    private String numero;
}
