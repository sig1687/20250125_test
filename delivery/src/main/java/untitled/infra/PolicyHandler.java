package untitled.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import untitled.config.kafka.KafkaProcessor;
import untitled.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    DeliveryRepository deliveryRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Orderconfirm'"
    )
    public void wheneverOrderconfirm_StartDelivery(
        @Payload Orderconfirm orderconfirm
    ) {
        Orderconfirm event = orderconfirm;
        System.out.println(
            "\n\n##### listener StartDelivery : " + orderconfirm + "\n\n"
        );

        // Comments //
        //1송장 출력
        //

        // Sample Logic //
        Delivery.startDelivery(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderModify'"
    )
    public void wheneverOrderModify_ModifyDelivery(
        @Payload OrderModify orderModify
    ) {
        OrderModify event = orderModify;
        System.out.println(
            "\n\n##### listener ModifyDelivery : " + orderModify + "\n\n"
        );
        // Sample Logic //

    }
}
//>>> Clean Arch / Inbound Adaptor
