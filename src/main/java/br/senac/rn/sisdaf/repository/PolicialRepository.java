package br.senac.rn.sisdaf.repository;

import br.senac.rn.sisdaf.model.Policial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicialRepository extends JpaRepository<Policial, Long> {
}
