package pe.com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.com.cibertec.model.ContratoEntity;

@Repository
public interface ContratoRepository extends JpaRepository<ContratoEntity, Integer> {
}
