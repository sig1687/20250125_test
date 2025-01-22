package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class DeliveryStart extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long name;
    private Long addres;
    private Long deriveristat;
    private Long deriverCoap;
}
