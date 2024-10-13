package pe.com.cibertec.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.cibertec.model.ContratoEntity;
import pe.com.cibertec.repository.ContratoRepository;
import pe.com.cibertec.service.ContratoService;

@Service
public class ContratoServiceImpl implements ContratoService {

    @Autowired
    private ContratoRepository contratoRepository;

    @Override
    public List<ContratoEntity> buscarTodosContratos() {
        return contratoRepository.findAll();
    }

    @Override
    public ContratoEntity buscarContratoPorId(Integer id) {
        return contratoRepository.findById(id).get();
    }

    @Override
    public void crearContrato(ContratoEntity contratoEntity) {
        contratoRepository.save(contratoEntity);
    }

    @Override
    public void actualizarContrato(Integer id, ContratoEntity contratoNuevo) {
        ContratoEntity contratoEncontrado = buscarContratoPorId(id);
        if (contratoEncontrado != null) {
            contratoEncontrado.setCargo(contratoNuevo.getCargo());
            contratoEncontrado.setRemuneracion(contratoNuevo.getRemuneracion());
            // Actualiza más campos según sea necesario
            contratoRepository.save(contratoEncontrado);
        }
    }

    @Override
    public void eliminarContrato(Integer id) {
        ContratoEntity contratoEncontrado = buscarContratoPorId(id);
        if (contratoEncontrado != null) {
            contratoRepository.delete(contratoEncontrado);
        }
    }
}

