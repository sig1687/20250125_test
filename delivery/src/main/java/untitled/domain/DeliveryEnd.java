package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryEnd extends AbstractEvent {

    private Long id;

    public DeliveryEnd(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryEnd() {
        super();
    }
}
//>>> DDD / Domain Event
