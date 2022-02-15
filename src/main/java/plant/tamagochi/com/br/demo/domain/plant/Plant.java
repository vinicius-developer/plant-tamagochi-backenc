package plant.tamagochi.com.br.demo.domain.plant;

import plant.tamagochi.com.br.demo.domain.validateData.ValidateDataToBuildPlant;

import javax.naming.directory.InvalidAttributeValueException;
import javax.naming.directory.InvalidAttributesException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.UUID;

public class Plant {

    private UUID uuid;

    private boolean isRain;

    private int moistureAir;

    private byte tamperature;

    private int moistureSoil;

    public Plant(UUID uuid, boolean isRain, int moistureAir, byte tamperature, int moistureSoil) {
        this.uuid = uuid;
        this.isRain = isRain;
        this.moistureAir = moistureAir;
        this.tamperature = tamperature;
        this.moistureSoil = moistureSoil;
    }

    public void Plant(HashMap<String, Serializable> data)
            throws InvalidAttributesException, InvalidAttributeValueException {

        new ValidateDataToBuildPlant().validate(data);

        this.uuid = data.get("uuid");
        this.isRain = isRain;
        this.moistureAir = moistureAir;
        this.tamperature = tamperature;
        this.moistureSoil = moistureSoil;

    }

}
