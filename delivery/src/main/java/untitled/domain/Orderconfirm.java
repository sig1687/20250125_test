package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class Orderconfirm extends AbstractEvent {

    private Long id;
    private String userId;
    private Long productId;
    private Integer qty;
}
