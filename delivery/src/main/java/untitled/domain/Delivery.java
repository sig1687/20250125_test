package untitled.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import untitled.DeliveryApplication;
import untitled.domain.DeliveryEnd;
import untitled.domain.DeliveryStart;

@Entity
@Table(name = "Delivery_table")
@Data
//<<< DDD / Aggregate Root
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long orderId;

    private Long name;

    private Long addres;

    private Long deriveriStat;

    private Long deriverCoap;

    @PostPersist
    public void onPostPersist() {
        DeliveryStart deliveryStart = new DeliveryStart(this);
        deliveryStart.publishAfterCommit();

        DeliveryEnd deliveryEnd = new DeliveryEnd(this);
        deliveryEnd.publishAfterCommit();
    }

    public static DeliveryRepository repository() {
        DeliveryRepository deliveryRepository = DeliveryApplication.applicationContext.getBean(
            DeliveryRepository.class
        );
        return deliveryRepository;
    }

    //<<< Clean Arch / Port Method
    public static void startDelivery(Orderconfirm orderconfirm) {
        //implement business logic here:

        /** Example 1:  new item 
        Delivery delivery = new Delivery();
        repository().save(delivery);

        */

        /** Example 2:  finding and process
        
        // if orderconfirm.pgId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> purchaseorderMap = mapper.convertValue(orderconfirm.getPgId(), Map.class);

        repository().findById(orderconfirm.get???()).ifPresent(delivery->{
            
            delivery // do something
            repository().save(delivery);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
