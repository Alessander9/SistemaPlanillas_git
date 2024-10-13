package pe.com.cibertec.service;

import java.util.List;
import pe.com.cibertec.model.ContratoEntity;

public interface ContratoService {
    List<ContratoEntity> buscarTodosContratos();
    ContratoEntity buscarContratoPorId(Integer id);
    void crearContrato(ContratoEntity contratoEntity);
    void actualizarContrato(Integer id, ContratoEntity contratoEntity);
    void eliminarContrato(Integer id);
}
