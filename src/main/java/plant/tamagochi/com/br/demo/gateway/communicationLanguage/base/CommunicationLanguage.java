package plant.tamagochi.com.br.demo.gateway.communicationLanguage.base;

import com.fasterxml.jackson.core.JsonProcessingException;

import javax.naming.directory.InvalidAttributeValueException;
import javax.naming.directory.InvalidAttributesException;
import java.io.Serializable;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

public abstract class CommunicationLanguage {

    protected String data;

    public void setData(String data) {

        if(data.isEmpty()) {
            throw new InvalidParameterException("it's necessary define data with setData");
        }

        this.data = data;

    }

    public abstract HashMap transform() throws JsonProcessingException, InvalidAttributesException, InvalidAttributeValueException;

}
