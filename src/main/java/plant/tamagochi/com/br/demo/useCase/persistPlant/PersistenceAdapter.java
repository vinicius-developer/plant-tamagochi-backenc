package plant.tamagochi.com.br.demo.useCase.persistPlant;

import plant.tamagochi.com.br.demo.domain.plant.Plant;

public interface PersistenceAdapter {

    void save(Plant plant);

}
