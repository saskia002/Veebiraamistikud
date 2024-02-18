package ee.tlu.veebiraamistikud.repository;

import ee.tlu.veebiraamistikud.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<ClientModel, Integer> {

    Optional<ClientModel> findByFirstName(String firstName);

}
