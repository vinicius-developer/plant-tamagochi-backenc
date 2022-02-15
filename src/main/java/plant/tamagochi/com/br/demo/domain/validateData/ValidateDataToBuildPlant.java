package plant.tamagochi.com.br.demo.domain.validateData;

import plant.tamagochi.com.br.demo.domain.validateData.base.Validator;

import javax.naming.directory.InvalidAttributeValueException;
import javax.naming.directory.InvalidAttributesException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.UUID;

public class ValidateDataToBuildPlant implements Validator {

    private HashMap<String, Serializable> data;

    @Override
    public void validate(HashMap<String, Serializable> data)
            throws InvalidAttributesException, InvalidAttributeValueException {

        this.data = data;
        this.validateContentAndValue("temperature", Integer.class);
        this.validateContentAndValue("moistureSoil", Integer.class);
        this.validateContentAndValue("moistureAir", Integer.class);
        this.validateContentAndValue("isRain", Boolean.class);
        this.validateContentAndValue("uuid", UUID.class);

    }

    private void validateContentAndValue(String key, Object obj)
            throws InvalidAttributesException, InvalidAttributeValueException {

        this.validateIfHaveKey(key);

        this.validateIfHaveTypeValueExpected(key, obj);

    }

    private void validateIfHaveKey(String key) throws InvalidAttributesException {
        if(!this.data.containsKey(key)) {
            throw new InvalidAttributesException("Data is invalid");
        }
    }

    private void validateIfHaveTypeValueExpected(String key, Object obj) throws InvalidAttributeValueException {
        if(this.data.get(key).getClass() == obj) {
            throw new InvalidAttributeValueException("Value of index is invalid");
        }
    }


}
