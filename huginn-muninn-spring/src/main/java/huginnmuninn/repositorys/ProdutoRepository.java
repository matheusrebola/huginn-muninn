package huginnmuninn.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import huginnmuninn.entities.Produtos;

@Repository
public interface ProdutoRepository extends JpaRepository<Produtos, UUID>{
}
