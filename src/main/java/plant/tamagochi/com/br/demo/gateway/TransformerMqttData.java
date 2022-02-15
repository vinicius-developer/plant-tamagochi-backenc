package plant.tamagochi.com.br.demo.gateway;

import com.fasterxml.jackson.core.JsonProcessingException;
import plant.tamagochi.com.br.demo.gateway.communicationLanguage.base.CommunicationLanguage;
import plant.tamagochi.com.br.demo.domain.validateData.ValidateDataToBuildPlant;

import javax.naming.directory.InvalidAttributeValueException;
import javax.naming.directory.InvalidAttributesException;
import java.io.Serializable;
import java.util.HashMap;

public class TransformerMqttData {

    public void input(CommunicationLanguage lenguage)
            throws JsonProcessingException, InvalidAttributesException, InvalidAttributeValueException {

        HashMap<String, Serializable> informationOfPlant = lenguage.transform();

    }


}
