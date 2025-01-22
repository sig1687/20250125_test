package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class GoodSoldOut extends AbstractEvent {

    private Long id;

    public GoodSoldOut(Goods aggregate) {
        super(aggregate);
    }

    public GoodSoldOut() {
        super();
    }
}
//>>> DDD / Domain Event
