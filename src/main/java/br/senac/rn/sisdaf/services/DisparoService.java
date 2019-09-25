package br.senac.rn.sisdaf.services;

import br.senac.rn.sisdaf.model.Disparo;
import br.senac.rn.sisdaf.repository.DisparoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisparoService {

    private DisparoRepository repository;

    public List<Disparo> listaTodos(){
        return repository.findAll();
    }

    public Disparo salva(Disparo disparo){
        return repository.save(disparo);
    }

    public void removerPorId(Long id){
        repository.deleteById(id);
    }
    public Disparo listaPorID(Long id){
        return repository.findById(id).get();
    }

}
