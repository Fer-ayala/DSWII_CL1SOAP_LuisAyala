package pe.edu.cibertec.api_soap_cl1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.api_soap_cl1.model.Publicacion;

@Repository
public interface PublicacionRepository extends JpaRepository<Publicacion,Integer> {
}
