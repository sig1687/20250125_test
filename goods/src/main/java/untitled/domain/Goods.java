package untitled.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import untitled.GoodsApplication;
import untitled.domain.GoodSoldOut;
import untitled.domain.GoodsDecrease;

@Entity
@Table(name = "Goods_table")
@Data
//<<< DDD / Aggregate Root
public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        GoodSoldOut goodSoldOut = new GoodSoldOut(this);
        goodSoldOut.publishAfterCommit();
    }

    public static GoodsRepository repository() {
        GoodsRepository goodsRepository = GoodsApplication.applicationContext.getBean(
            GoodsRepository.class
        );
        return goodsRepository;
    }

    //<<< Clean Arch / Port Method
    public static void goodsDecrease(Orderconfirm orderconfirm) {
        //implement business logic here:

        /** Example 1:  new item 
        Goods goods = new Goods();
        repository().save(goods);

        GoodsDecrease goodsDecrease = new GoodsDecrease(goods);
        goodsDecrease.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        // if orderconfirm.pgId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> purchaseorderMap = mapper.convertValue(orderconfirm.getPgId(), Map.class);

        repository().findById(orderconfirm.get???()).ifPresent(goods->{
            
            goods // do something
            repository().save(goods);

            GoodsDecrease goodsDecrease = new GoodsDecrease(goods);
            goodsDecrease.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
