package hello.mapper;

import hello.entity.ShopOrderDetail;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import hello.entity.SimpleShopOrderDetail;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lv-success
 * @since 2018-09-10
 */
public interface ShopOrderDetailMapper extends BaseMapper<ShopOrderDetail> {

    /**
     * @param orderIds
     * @return
     */
    List<SimpleShopOrderDetail> getDetailByOrderId(List<String> orderIds);
}
