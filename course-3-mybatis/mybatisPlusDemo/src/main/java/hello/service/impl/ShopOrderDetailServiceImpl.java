package hello.service.impl;

import hello.entity.ShopOrderDetail;
import hello.mapper.ShopOrderDetailMapper;
import hello.service.ShopOrderDetailService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lv-success
 * @since 2018-09-10
 */
@Service
public class ShopOrderDetailServiceImpl extends ServiceImpl<ShopOrderDetailMapper, ShopOrderDetail> implements ShopOrderDetailService {

}
