package huginnmuninn.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import huginnmuninn.entities.ItensPedidos;

@Repository
public interface ItensPedidoRepository extends JpaRepository<ItensPedidos, UUID>{
}
