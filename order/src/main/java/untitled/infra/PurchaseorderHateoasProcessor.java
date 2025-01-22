package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class PurchaseorderHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Purchaseorder>> {

    @Override
    public EntityModel<Purchaseorder> process(
        EntityModel<Purchaseorder> model
    ) {
        return model;
    }
}
