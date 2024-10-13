package pe.com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.cibertec.model.ModalidadEntity;

@Repository
public interface ModalidadRepository extends JpaRepository<ModalidadEntity, Integer> {
}
