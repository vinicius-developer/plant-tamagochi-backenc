package plant.tamagochi.com.br.demo.gateway.validateData;

import org.junit.jupiter.api.Test;
import plant.tamagochi.com.br.demo.domain.validateData.ValidateDataToBuildPlant;

import javax.naming.directory.InvalidAttributeValueException;
import javax.naming.directory.InvalidAttributesException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ValidateDataToBuildPlantTest {

    @Test
    public void dataDontHaveIndex() {

        Exception exception = assertThrows(InvalidAttributesException.class, () -> {
            HashMap<String, Serializable> data = new HashMap<String, java.io.Serializable>();

            data.put("moistureSoil", 125);
            data.put("moistureAir", 85);
            data.put("isRain", false);
            data.put("uuid", UUID.fromString("a15ace80-8d20-11ec-b909-0242ac120002"));

            new ValidateDataToBuildPlant().validate(data);

        });

        assertEquals(exception.getMessage(), "Data is invalid");

    }

    @Test
    public void dataHavaIncorrectValueForIndex() {

        Exception exception = assertThrows(InvalidAttributeValueException.class, () -> {
            HashMap<String, Serializable> data = new HashMap<String, java.io.Serializable>();

            data.put("temperature", "sadf");
            data.put("moistureSoil", 125);
            data.put("moistureAir", 85);
            data.put("isRain", false);
            data.put("uuid", UUID.fromString("a15ace80-8d20-11ec-b909-0242ac120002"));

            new ValidateDataToBuildPlant().validate(data);

        });

        assertEquals(exception.getMessage(), "Value of index is invalid");

    }

}