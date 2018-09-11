package hello.service;

import hello.entity.ShopCreateOrderRecord;
import com.baomidou.mybatisplus.service.IService;
import hello.entity.SimpleShopOrder;
import hello.entity.SimpleShopOrderDetail;

import java.util.List;

/**
 * <p>
 * 下单记录表 服务类
 * </p>
 *
 * @author lv-success
 * @since 2018-09-10
 */
public interface ShopCreateOrderRecordService extends IService<ShopCreateOrderRecord> {

    /**
     *
     * @param simpleShopOrderList
     * @param shopOrderDetail
     */
    void saveOrderRecord(List<SimpleShopOrder> simpleShopOrderList, List<SimpleShopOrderDetail> shopOrderDetail);

}
