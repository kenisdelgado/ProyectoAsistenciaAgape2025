package com.esfe.Asistencia.Servicios.Implementaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.esfe.Asistencia.Modelos.DocenteGrupo;
import com.esfe.Asistencia.Servicios.Interfaces.IDocenteGrupoService;
import com.esfe.Asistencia.Servicios.Interfaces.IDocenteService;
import com.esfe.Asistencia.Servicios.Interfaces.IGrupoService;

import org.springframework.data.domain.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/asignaciones")
public class DocenteGrupoService {

    @Autowired
    private IDocenteGrupoService docenteGrupoService;

    @Autowired
    private IGrupoService grupoService;

    @Autowired
    private IDocenteService docenteService;

    
}
