package pe.com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.cibertec.model.DetalleHorarioEntity;

@Repository
public interface DetalleHorarioRepository extends JpaRepository<DetalleHorarioEntity, Integer> {
}
