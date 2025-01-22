package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class GoodsHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Goods>> {

    @Override
    public EntityModel<Goods> process(EntityModel<Goods> model) {
        return model;
    }
}
