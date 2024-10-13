package pe.com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.cibertec.model.EmpleadorEntity;

@Repository
public interface EmpleadorRepository extends JpaRepository<EmpleadorEntity, String> {
}
