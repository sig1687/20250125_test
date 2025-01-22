package untitled.domain;

import untitled.domain.OrderModify;
import untitled.domain.Orderconfirm;
import untitled.OrderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;


@Entity
@Table(name="Purchaseorder_table")
@Data

//<<< DDD / Aggregate Root
public class Purchaseorder  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    private Long orderId;
    
    
    
    
    private String userId;
    
    
    
    
    private Long productId;
    
    
    
    
    private Integer qty;
    
    
    
    
    private String status;

    @PostPersist
    public void onPostPersist(){


        OrderModify orderModify = new OrderModify(this);
        orderModify.publishAfterCommit();

    
    }
    @PostUpdate
    public void onPostUpdate(){

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        untitled.external.  = new untitled.external.();
        // mappings goes here
        OrderApplication.applicationContext.getBean(untitled.external.Service.class)
            .statDeliveryApi();


        Orderconfirm orderconfirm = new Orderconfirm(this);
        orderconfirm.publishAfterCommit();

    
    }

    public static PurchaseorderRepository repository(){
        PurchaseorderRepository purchaseorderRepository = OrderApplication.applicationContext.getBean(PurchaseorderRepository.class);
        return purchaseorderRepository;
    }






}
//>>> DDD / Aggregate Root
