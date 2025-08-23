package com.esfe.Asistencia.Servicios.Implementaciones;

import com.esfe.Asistencia.Modelos.DocenteGrupo;
import com.esfe.Asistencia.Repositorios.IDocenteGrupoRepository;
import com.esfe.Asistencia.Servicios.Interfaces.IDocenteGrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocenteGrupoServiceImpl implements IDocenteGrupoService {

    @Autowired
    private IDocenteGrupoRepository docenteGrupoRepository;

    @Override
    public List<DocenteGrupo> findAll() {
        return docenteGrupoRepository.findAll();
    }

    @Override
    public Page<DocenteGrupo> findAll(Pageable pageable) {
        return docenteGrupoRepository.findByOrderByNombreDesc(pageable);
    }

    @Override
    public Optional<DocenteGrupo> findById(Integer id) {
        return docenteGrupoRepository.findById(id);
    }

    @Override
    public DocenteGrupo save(DocenteGrupo docenteGrupo) {
        return docenteGrupoRepository.save(docenteGrupo);
    }

    @Override
    public void deleteById(Integer id) {
        docenteGrupoRepository.deleteById(id);
    }
}
