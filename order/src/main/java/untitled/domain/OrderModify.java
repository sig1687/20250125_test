package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderModify extends AbstractEvent {

    private Long id;

    public OrderModify(Purchaseorder aggregate) {
        super(aggregate);
    }

    public OrderModify() {
        super();
    }
}
//>>> DDD / Domain Event
