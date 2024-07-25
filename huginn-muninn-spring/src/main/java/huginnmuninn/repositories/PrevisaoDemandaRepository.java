package huginnmuninn.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import huginnmuninn.entities.PrevisaoDemanda;

@Repository
public interface PrevisaoDemandaRepository extends JpaRepository<PrevisaoDemanda, UUID>{

}
