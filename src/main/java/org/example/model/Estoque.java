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
public class Estoque {
    @Id
    @EqualsAndHashCode.Include
    private Long id;
    private Integer produto_id;
    private Integer quantidade;
}
