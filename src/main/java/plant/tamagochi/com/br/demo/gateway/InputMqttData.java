package plant.tamagochi.com.br.demo.gateway;

import plant.tamagochi.com.br.demo.gateway.communicationLanguage.base.CommunicationLanguage;
import com.fasterxml.jackson.core.JsonProcessingException;
import plant.tamagochi.com.br.demo.domain.plant.Plant;
import plant.tamagochi.com.br.demo.useCase.persistPlant.PersistenceAdapter;
import plant.tamagochi.com.br.demo.useCase.persistPlant.SaveInformationPlant;

import javax.naming.directory.InvalidAttributeValueException;
import java.util.HashMap;

public class InputMqttData {

    public static void input(CommunicationLanguage lenguage, PersistenceAdapter persistence)
            throws JsonProcessingException, InvalidAttributeValueException {

        HashMap<? , ?> information = lenguage.transform();

        Plant plant = new Plant(information);

        SaveInformationPlant.save(plant, persistence);

    }


}
