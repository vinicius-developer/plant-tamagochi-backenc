package plant.tamagochi.com.br.demo.gateway.communicationLanguage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import plant.tamagochi.com.br.demo.gateway.communicationLanguage.base.CommunicationLanguage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.UUID;

public class JsonLanguage extends CommunicationLanguage {

    public JsonLanguage(String data) {
        super(data);
    }

    @Override
    public HashMap<String, Serializable> transform() throws JsonProcessingException {

        HashMap<String, Serializable> json = new ObjectMapper().readValue(this.data, HashMap.class);

        json.put("uuid", UUID.fromString((String)json.get("uuid")));

        json.put("isRain", Boolean.parseBoolean((String)json.get("isRain")));

        return json;

    }

}
