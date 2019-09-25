package br.senac.rn.sisdaf.controller;

import br.senac.rn.sisdaf.model.Opm;
import br.senac.rn.sisdaf.services.OpmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/opm")
public class OpmController {

    @Autowired
    private OpmService opmService;

    @GetMapping
    public String salva(Opm opm){

        opmService.salva(opm);
        return "redirect:/opm";
    }

}
