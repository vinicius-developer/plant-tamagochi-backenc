package plant.tamagochi.com.br.demo.gateway.communicationLanguage.base;

import com.fasterxml.jackson.core.JsonProcessingException;

import javax.naming.directory.InvalidAttributeValueException;
import java.security.InvalidParameterException;
import java.util.HashMap;

public abstract class CommunicationLanguage {

    protected String data;

    public void setData(String data) {

        if(data.isEmpty()) {
            throw new InvalidParameterException("it's necessary define data with setData");
        }

        this.data = data;

    }

    protected void validateData() throws InvalidAttributeValueException {
        if(this.data == null) {
            throw new InvalidAttributeValueException("No data setted");
        }
    }


    public abstract HashMap<?, ?> transform() throws JsonProcessingException, InvalidAttributeValueException;

}
