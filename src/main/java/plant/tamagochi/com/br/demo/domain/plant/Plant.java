package plant.tamagochi.com.br.demo.domain.plant;

import plant.tamagochi.com.br.demo.domain.validateData.ValidateDataToBuildPlant;

import javax.naming.directory.InvalidAttributeValueException;
import javax.naming.directory.InvalidAttributesException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.UUID;

public class Plant {

    private UUID uuid;

    private Boolean isRain;

    private Integer moistureAir;

    private Byte temperature;

    private Integer moistureSoil;

    public Plant(UUID uuid, boolean isRain, int moistureAir, byte temperature, int moistureSoil) {
        this.uuid = uuid;
        this.isRain = isRain;
        this.moistureAir = moistureAir;
        this.temperature = temperature;
        this.moistureSoil = moistureSoil;
    }

    public Plant(HashMap data) throws InvalidAttributesException, InvalidAttributeValueException {

        new ValidateDataToBuildPlant().validate(data);

        this.uuid = (UUID) data.get("uuid");
        this.isRain = (Boolean) data.get("isRain");
        this.moistureAir = (Integer) data.get("moistureAir");
        this.temperature = (Byte) data.get("temperature");
        this.moistureSoil = (Integer) data.get("moistureSoil");

    }



}
