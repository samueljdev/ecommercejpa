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
public class Produto {

    @Id
    private Integer id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
}