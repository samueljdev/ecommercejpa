package org.example.model;

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
@Table(name = "tb_cliente")
public class Cliente {
    @Id
    @EqualsAndHashCode.Include
    private Long id;

    private String nome;

    private SexoCliente sexoCliente;
}
