package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Orderconfirm extends AbstractEvent {

    private Long id;
    private String userid;
    private Long productid;
    private Integer qty;

    public Orderconfirm(Purchaseorder aggregate) {
        super(aggregate);
    }

    public Orderconfirm() {
        super();
    }
}
//>>> DDD / Domain Event
