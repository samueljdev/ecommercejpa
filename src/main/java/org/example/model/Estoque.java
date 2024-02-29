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
@Table(name = "tb_estoque")
public class Estoque {
    @Id
    @EqualsAndHashCode.Include
    private Integer id;

    @Column(name = "produto_id")
    private Integer produto_id;

    private Integer quantidade;
}
