package plant.tamagochi.com.br.demo.gateway.communicationLanguage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import plant.tamagochi.com.br.demo.domain.plant.Plant;
import plant.tamagochi.com.br.demo.domain.validateData.ValidateDataToBuildPlant;
import plant.tamagochi.com.br.demo.gateway.communicationLanguage.base.CommunicationLanguage;

import javax.naming.directory.InvalidAttributeValueException;
import javax.naming.directory.InvalidAttributesException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.UUID;

public class JsonLanguage extends CommunicationLanguage {

    @Override
    public HashMap transform() throws JsonProcessingException, InvalidAttributesException, InvalidAttributeValueException {

        return new ObjectMapper().readValue(this.data, HashMap.class);

    }

}
