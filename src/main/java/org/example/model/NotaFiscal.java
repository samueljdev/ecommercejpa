package org.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "tb_nota_fiscal")
public class NotaFiscal {
    @Id
    @EqualsAndHashCode.Include
    private Integer id;

    @Column(name = "pedido_id")
    private Integer pedido_id;

    private String xml;

    @Column(name = "data_emissao")
    private Date dataEmissao;
}
