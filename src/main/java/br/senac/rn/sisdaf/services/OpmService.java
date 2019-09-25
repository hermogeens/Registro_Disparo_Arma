package br.senac.rn.sisdaf.services;

import br.senac.rn.sisdaf.model.Opm;
import br.senac.rn.sisdaf.repository.OpmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpmService {

    @Autowired
    private OpmRepository opmRepository;

    public Opm salva(Opm entity){
        return opmRepository.save(entity);
    }


}
