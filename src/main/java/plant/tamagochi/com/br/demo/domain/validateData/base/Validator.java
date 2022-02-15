package plant.tamagochi.com.br.demo.domain.validateData.base;

import javax.naming.directory.InvalidAttributeValueException;
import javax.naming.directory.InvalidAttributesException;
import java.io.Serializable;
import java.util.HashMap;

public interface Validator {

    void validate(HashMap data) throws InvalidAttributesException, InvalidAttributeValueException;

}
