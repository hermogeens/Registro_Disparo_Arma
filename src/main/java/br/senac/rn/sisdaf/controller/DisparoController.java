package br.senac.rn.sisdaf.controller;

import br.senac.rn.sisdaf.model.Disparo;
import br.senac.rn.sisdaf.services.DisparoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/disparos")
public class DisparoController {
    private DisparoService service;

    @GetMapping
    public String listaTodos(Model model){
        Disparo disparo = new Disparo();
        model.addAttribute("disparo", disparo);
        List<Disparo> disparos = service.listaTodos();
        model.addAttribute("disparos", disparos);
        System.out.println(disparo);
        return "disparos";
    }
    @PostMapping
    public String salva(Disparo disparo){
        service.salva(disparo);
        return "redirect:/disparos";
    }
    @GetMapping("/{id}/remove")
    public String remove(@PathVariable("id") Long id){
        service.removerPorId(id);
        return "redirect:/disparos";
    }
    public String edita(@PathVariable("id") Long id, Model model){
        Disparo disparo = service.listaPorID(id);
        model.addAttribute("disparo", disparo);
        List<Disparo> disparos = service.listaTodos();
        model.addAttribute("disparos", disparos);
        return "disparos";
    }


}
