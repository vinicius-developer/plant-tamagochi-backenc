package plant.tamagochi.com.br.demo.gateway.communicationLanguage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import plant.tamagochi.com.br.demo.gateway.communicationLanguage.base.CommunicationLanguage;

import javax.naming.directory.InvalidAttributeValueException;
import java.util.HashMap;

public class JsonLanguage extends CommunicationLanguage {

    @Override
    public HashMap<?, ?> transform() throws JsonProcessingException, InvalidAttributeValueException {

        this.validateData();

        return new ObjectMapper().readValue(this.data, HashMap.class);

    }

}
