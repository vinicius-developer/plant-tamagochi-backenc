package plant.tamagochi.com.br.demo.infrastructure.springPlantPersistence;

import javax.persistence.*;
import plant.tamagochi.com.br.demo.domain.plant.Plant;

@Entity(name = "plant")
public class PlantEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String uuid;

    private Boolean isRain;

    private Integer moistureAir;

    private Byte temperature;

    private Integer moistureSoil;

    public PlantEntity() {}

    public PlantEntity(Plant plant) {
        this.uuid = plant.getUuid().toString();
        this.isRain = plant.getRain();
        this.moistureAir = plant.getMoistureAir();
        this.moistureSoil = plant.getMoistureSoil();
        this.temperature = plant.getTemperature();
    }



}
