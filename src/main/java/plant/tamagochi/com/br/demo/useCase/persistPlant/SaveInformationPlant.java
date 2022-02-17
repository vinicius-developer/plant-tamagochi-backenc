package plant.tamagochi.com.br.demo.useCase.persistPlant;

import plant.tamagochi.com.br.demo.domain.plant.Plant;

public class SaveInformationPlant {

    static public void save(Plant plant, PersistenceAdapter persistence) {
        System.out.println(plant);
        persistence.save(plant);
    }

}
