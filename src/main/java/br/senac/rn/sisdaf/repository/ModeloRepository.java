package br.senac.rn.sisdaf.repository;

import br.senac.rn.sisdaf.model.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModeloRepository extends JpaRepository<Modelo, Long> {
}
