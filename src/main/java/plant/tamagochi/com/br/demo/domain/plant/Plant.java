package plant.tamagochi.com.br.demo.domain.plant;

import java.util.HashMap;
import java.util.UUID;

public class Plant {

    private final UUID uuid;

    private final Boolean isRain;

    private final Integer moistureAir;

    private final Byte temperature;

    private final Integer moistureSoil;

    public Plant(UUID uuid, boolean isRain, int moistureAir, byte temperature, int moistureSoil) {
        this.uuid = uuid;
        this.isRain = isRain;
        this.moistureAir = moistureAir;
        this.temperature = temperature;
        this.moistureSoil = moistureSoil;
    }

    public Plant(HashMap<?, ?> data) {

        this.uuid = UUID.fromString(data.get("uuid").toString());
        this.isRain = Boolean.parseBoolean(data.get("isRain").toString());
        this.moistureAir = Integer.parseInt(data.get("moistureAir").toString());
        this.temperature = Byte.parseByte(data.get("temperature").toString());
        this.moistureSoil = Integer.parseInt(data.get("moistureSoil").toString());

    }

    public UUID getUuid() {
        return uuid;
    }

    public Boolean getRain() {
        return isRain;
    }

    public Integer getMoistureAir() {
        return moistureAir;
    }

    public Byte getTemperature() {
        return temperature;
    }

    public Integer getMoistureSoil() {
        return moistureSoil;
    }

}
