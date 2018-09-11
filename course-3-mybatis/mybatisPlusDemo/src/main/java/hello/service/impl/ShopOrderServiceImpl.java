package hello.service.impl;

import hello.entity.ShopOrder;
import hello.entity.SimpleShopOrder;
import hello.entity.SimpleShopOrderDetail;
import hello.mapper.ShopOrderDetailMapper;
import hello.mapper.ShopOrderMapper;
import hello.service.ShopOrderService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lv-success
 * @since 2018-09-10
 */
@Service
public class ShopOrderServiceImpl extends ServiceImpl<ShopOrderMapper, ShopOrder> implements ShopOrderService {
    @Autowired
    private ShopOrderDetailMapper shopOrderDetailMapper;
    @Override
    public List<SimpleShopOrder> selectOrders(String origin) {
        return baseMapper.selectOrders(origin);
    }

    @Override
    public List<SimpleShopOrderDetail> getDetailById(List<String> orderIds) {
        return shopOrderDetailMapper.getDetailByOrderId(orderIds);
    }
}
