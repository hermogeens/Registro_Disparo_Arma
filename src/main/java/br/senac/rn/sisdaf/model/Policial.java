package br.senac.rn.sisdaf.model;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tb_policiais")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Policial {

    @Id
    @NotNull
    @Autowired
    @Column(name="pol_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name="pol_nome", length = 80)
    private String nome;

    @NotNull
    @Column(name="pol_matricula", length = 7)
    private String matricula;

    @NotNull
    @Column(name="pol_cpf", length = 14)
    private String cpf;

    @NotNull
    @Length(max = 20)
    @Column(name="pol_cargo", length =20)
    private String cargo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pol_opm_id")
    private Opm opm;


}
