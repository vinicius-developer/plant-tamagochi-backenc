package plant.tamagochi.com.br.demo.gateway.communicationLanguage;

import plant.tamagochi.com.br.demo.gateway.communicationLanguage.base.CommunicationLanguage;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;
import java.util.Map;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class JsonLanguageTest {

    private String json;

    @BeforeEach
    public void setUp() {
        this.json = "{ " +
                "\"temperature\": 25," +
                "\"moistureSoil\": 125," +
                "\"moistureAir\": 85," +
                "\"isRain\": \"false\"," +
                "\"uuid\": \"a15ace80-8d20-11ec-b909-0242ac120002\"" +
                "} ";
    }

    @Test
    public void transformStringInJson() throws JsonProcessingException {

        CommunicationLanguage jsonLenguage = new JsonLanguage(this.json);

        Map<String, Object> dataJson = jsonLenguage.transform();

        assertEquals(dataJson.get("temperature"), 25);
        assertEquals(dataJson.get("moistureSoil"), 125);
        assertEquals(dataJson.get("moistureAir"), 85);
        assertEquals(dataJson.get("isRain"), false);
        assertEquals(dataJson.get("uuid"), UUID.fromString("a15ace80-8d20-11ec-b909-0242ac120002"));

    }

    @Test
    public void assertExceptionWhenNoInformaionDataForJson() {

        Exception exception = assertThrows(InvalidParameterException.class, () -> {
                new JsonLanguage("");
        });

        assertEquals(exception.getMessage(), "it's necessary define data with setData");

    }

}