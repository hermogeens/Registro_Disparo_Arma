package br.senac.rn.sisdaf.model;


import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tb_armas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Arma {

    @Id
    @NotNull
    @Autowired
    @Column(name="arm_serial", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serial;

    @NotNull
    @Column(name="arm_tombamento", length = 15, unique = true)
    private String tombamento;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "arm_opm_id")
    private Opm opm;



}
