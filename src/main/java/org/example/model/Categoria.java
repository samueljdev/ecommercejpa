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
@Table(name = "tb_categoria")
public class Categoria {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "tabela")
    @TableGenerator(name = "tabela", table = "hibernate_sequences",
            pkColumnName = "sequence_name",
            pkColumnValue = "tb_categoria",
            valueColumnName = "next_val",
            initialValue = 0,
            allocationSize = 50)
    private Integer id;

    private String nome;
}
