package br.senac.rn.sisdaf.model;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name="tb_modelos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Modelo {


    @Id
    @Autowired
    @Column(name="mod_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name="mod_tipo")
    private String tipo;

    @Column(name="mod_calibre")
    private String calibre;

    @Column(name = "mod_nome")
    private String nome;


    @Column(name = "mod_fabricante")
    private String fabricante;




}
