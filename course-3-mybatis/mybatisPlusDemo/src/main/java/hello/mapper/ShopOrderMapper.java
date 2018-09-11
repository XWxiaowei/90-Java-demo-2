package hello.mapper;

import hello.entity.ShopOrder;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import hello.entity.SimpleShopOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lv-success
 * @since 2018-09-10
 */
public interface ShopOrderMapper extends BaseMapper<ShopOrder> {

    /**
     * @param origin
     * @return
     */
    List<SimpleShopOrder> selectOrders(@Param("origin") String origin);
}
