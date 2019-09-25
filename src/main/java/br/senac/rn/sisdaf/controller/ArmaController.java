package br.senac.rn.sisdaf.controller;


import br.senac.rn.sisdaf.model.Arma;
import br.senac.rn.sisdaf.services.ArmaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/arma")

public class ArmaController {

    @Autowired
    private ArmaService service;

    @GetMapping
    public String listaTodos(Model model) {
        Arma arma = new Arma();
        model.addAttribute("arma", arma);
        List<Arma> armas = service.listaTodos();
        model.addAttribute("armas", armas);
        return "armas";
    }

    @PostMapping
    public String salva(Arma arma){

        service.salva(arma);
        return "redirect:/armas";
    }

    @GetMapping("/{id}/remove")
    public String remove (@PathVariable("id") Long id){
        service.removePorId(id);
        return "redirect:/armas";
    }

    public String edita(@PathVariable("id") Long id, Model model){
        Arma arma = service.listaPorID(id);
        model.addAttribute("arma", arma);
        List<Arma> armas = service.listaTodos();
        model.addAttribute("armas", armas);
        System.out.println(arma);
        return "armas";

    }


}