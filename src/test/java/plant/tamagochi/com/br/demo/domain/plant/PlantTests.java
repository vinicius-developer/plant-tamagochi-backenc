package plant.tamagochi.com.br.demo.domain.plant;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlantTests {

    @Test
    public void createPlantByMap() {

        HashMap<String, String> infomation = new HashMap<String, String>();

        infomation.put("temperature", "25");
        infomation.put("moistureSoil", "125");
        infomation.put("moistureAir", "85");
        infomation.put("isRain", "false");
        infomation.put("uuid","a15ace80-8d20-11ec-b909-0242ac120002");

        new Plant(infomation);

    }



}
