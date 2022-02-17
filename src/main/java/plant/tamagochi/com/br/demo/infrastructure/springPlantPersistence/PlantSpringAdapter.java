package plant.tamagochi.com.br.demo.infrastructure.springPlantPersistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import plant.tamagochi.com.br.demo.domain.plant.Plant;
import plant.tamagochi.com.br.demo.useCase.persistPlant.PersistenceAdapter;

@Service
public class PlantSpringAdapter implements PersistenceAdapter {

    @Autowired
    private PlantRepository repository;

    @Override
    public void save(Plant plant) {

        PlantEntity entity = new PlantEntity(plant);

        this.repository.save(entity);

    }

}
