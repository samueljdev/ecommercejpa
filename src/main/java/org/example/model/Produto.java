package org.example.model;

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
@Table(name = "tb_produto")
public class Produto {
    @Id
    @EqualsAndHashCode.Include
    private Integer id;

    private String nome;

    private String descricao;

    private BigDecimal preco;
}