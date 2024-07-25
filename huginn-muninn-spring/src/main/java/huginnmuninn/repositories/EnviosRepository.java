package huginnmuninn.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import huginnmuninn.entities.Envios;

@Repository
public interface EnviosRepository extends JpaRepository<Envios, UUID>{

}
