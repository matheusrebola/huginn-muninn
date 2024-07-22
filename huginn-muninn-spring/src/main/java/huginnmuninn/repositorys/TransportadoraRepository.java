package huginnmuninn.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import huginnmuninn.entities.Transportadoras;

@Repository
public interface TransportadoraRepository extends JpaRepository<Transportadoras, UUID>{

}
