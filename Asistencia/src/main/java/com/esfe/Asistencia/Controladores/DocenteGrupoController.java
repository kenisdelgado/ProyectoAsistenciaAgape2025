package com.esfe.Asistencia.Controladores;

import com.esfe.Asistencia.Modelos.DocenteGrupo;
import com.esfe.Asistencia.Servicios.Interfaces.IDocenteGrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/docentegrupos")
public class DocenteGrupoController {

    @Autowired
    private IDocenteGrupoService docenteGrupoService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("docenteGrupos", docenteGrupoService.findAll());
        return "docentegrupos/lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("docenteGrupo", new DocenteGrupo());
        return "docentegrupos/form";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute DocenteGrupo docenteGrupo) {
        docenteGrupoService.save(docenteGrupo);
        return "redirect:/docentegrupos";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        docenteGrupoService.findById(id).ifPresent(dg -> model.addAttribute("docenteGrupo", dg));
        return "docentegrupos/form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        docenteGrupoService.deleteById(id);
        return "redirect:/docentegrupos";
    }
}
