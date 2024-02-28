package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class NotaFiscal {
    @Id
    @EqualsAndHashCode.Include
    private Long id;
    private Integer pedido_id;
    private String xml;
    private Date dataEmissao;
}
