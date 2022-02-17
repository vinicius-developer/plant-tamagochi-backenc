package plant.tamagochi.com.br.demo.infrastructure.mqtt;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Service;
import plant.tamagochi.com.br.demo.gateway.InputMqttData;
import plant.tamagochi.com.br.demo.gateway.communicationLanguage.JsonLanguage;
import plant.tamagochi.com.br.demo.gateway.communicationLanguage.base.CommunicationLanguage;
import plant.tamagochi.com.br.demo.infrastructure.springPlantPersistence.PlantSpringAdapter;

import javax.naming.directory.InvalidAttributeValueException;

@Service
public class TransformMessages implements MessageHandler {

    @Autowired
    private PlantSpringAdapter plantSpringAdapter;

    @Override
    public void handleMessage(Message<?> message) throws MessagingException {

        CommunicationLanguage converter = new JsonLanguage();

        converter.setData((String) message.getPayload());

        try {
            InputMqttData.input(converter, this.plantSpringAdapter);
        } catch (JsonProcessingException | InvalidAttributeValueException e) {
            e.printStackTrace();
        }

    }

}
