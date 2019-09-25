package br.senac.rn.sisdaf.services;

import br.senac.rn.sisdaf.model.Arma;
import br.senac.rn.sisdaf.repository.ArmaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ArmaService {
    @Autowired
    private ArmaRepository armaRepository;

    public List<Arma> listaTodos(){
        return armaRepository.findAll();
    }

    public Arma salva(Arma entity){
        return armaRepository.save(entity);
    }


    public void removePorId(Long id) {
        armaRepository.deleteById(id);
    }

    public Arma listaPorID(Long id) {
        return armaRepository.findById(id).get();
    }


}
