package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class GoodsDecrease extends AbstractEvent {

    private Long id;

    public GoodsDecrease(Goods aggregate) {
        super(aggregate);
    }

    public GoodsDecrease() {
        super();
    }
}
//>>> DDD / Domain Event
