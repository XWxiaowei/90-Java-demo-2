package hello.service;

import hello.entity.ShopOrder;
import com.baomidou.mybatisplus.service.IService;
import hello.entity.SimpleShopOrder;
import hello.entity.SimpleShopOrderDetail;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lv-success
 * @since 2018-09-10
 */
public interface ShopOrderService extends IService<ShopOrder> {
    /**
     * 查询所有普通订单
     * @return
     */
    List<SimpleShopOrder> selectOrders(String origin);

    /**
     * 查询订单明细
     * @param orderIds
     * @return
     */
    List<SimpleShopOrderDetail> getDetailById(List<String> orderIds);
}
