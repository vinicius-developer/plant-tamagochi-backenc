package plant.tamagochi.com.br.demo.infrastructure.springPlantPersistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlantRepository extends CrudRepository<PlantEntity, Long> {

}
