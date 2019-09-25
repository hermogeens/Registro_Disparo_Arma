package br.senac.rn.sisdaf.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name="tb_disparos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Disparo {

    @Id
    @NotNull
    @Autowired
    @Column(name="dis_id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name="dis_data")
    private Date data;

    @NotNull
    @Column(name="dis_hora")
    private Time hora;

    @NotNull
    @Column(name="dis_local", length = 100)
    private String local;

    @NotNull
    @Column(name="dis_quantidade")
    private Long quantidade;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dis_opm_id")
    private Opm opm;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dis_pol_id")
    private Policial policial;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dis_arm_id")
    private Arma arma;


}
