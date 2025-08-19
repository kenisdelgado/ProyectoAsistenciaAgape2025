package com.esfe.Asistencia.Servicios.Interfaces;

import java.util.*;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.esfe.Asistencia.Modelos.DocenteGrupo;

public interface IDocenteGrupoService {

    List<DocenteGrupo> buscarTodos();

    Page<DocenteGrupo> buscarTodosPaginados(Pageable pageable);

    Optional<DocenteGrupo> buscarPorId(Integer id);

    DocenteGrupo guardar(DocenteGrupo docenteGrupo);

    void eliminar(Integer id);

    void crearOEditar(DocenteGrupo docenteGrupo);
}


