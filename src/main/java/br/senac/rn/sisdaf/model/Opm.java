package br.senac.rn.sisdaf.model;


import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tb_opms")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Opm {

    @Id
    @Column(name="opm_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Length(max = 100)
    @Column(name="opm_nome")
    private String nome;

    @NotNull
    @Length(max = 5)
    @Column(name="opm_sigla")
    private String sigla;

}
