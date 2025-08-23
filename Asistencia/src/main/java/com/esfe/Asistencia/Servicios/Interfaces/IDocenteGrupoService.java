package com.esfe.Asistencia.Servicios.Interfaces;

import com.esfe.Asistencia.Modelos.DocenteGrupo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IDocenteGrupoService {
    List<DocenteGrupo> findAll();
    Page<DocenteGrupo> findAll(Pageable pageable);
    Optional<DocenteGrupo> findById(Integer id);
    DocenteGrupo save(DocenteGrupo docenteGrupo);
    void deleteById(Integer id);
}
