package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryStart extends AbstractEvent {

    private Long id;
    private Long orderid;
    private Long name;
    private Long addres;
    private Long deriveristat;
    private Long derivercoap;

    public DeliveryStart(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryStart() {
        super();
    }
}
//>>> DDD / Domain Event
