package com.gestao.convidados.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.algaworks.festa.repository.ConvidadosRepositorie;

@Controller
public class ConvidadosController {
    @Autowired
    private ConvidadosRepositorie convidados;
    
    @GetMapping("/convidados")
    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("ListaConvidados");
        modelAndView.addObject("convidados", convidados.findAll());
        return modelAndView;
    }

    @PostMapping("/convidados")
    public String salvar(Convidado convidado) {
    this.convidados.save(convidado);
    return "redirect:/convidados";
    }
}