package com.esfe.Asistencia.Repositorios;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.esfe.Asistencia.Modelos.DocenteGrupo;


public interface IDocenteGrupo extends JpaRepository<DocenteGrupo, Integer> {
    
    Page<DocenteGrupo> findAll(Pageable pageable);
}
