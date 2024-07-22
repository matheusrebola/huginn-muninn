package huginnmuninn.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import huginnmuninn.entities.Clientes;

@Repository
public interface ClienteRepository extends JpaRepository<Clientes, UUID>{
}
