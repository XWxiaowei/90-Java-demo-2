package hello.service.impl;

import hello.entity.ShopCreateOrderRecord;
import hello.entity.SimpleShopOrder;
import hello.entity.SimpleShopOrderDetail;
import hello.enums.RegisterTypeEnum;
import hello.mapper.ShopCreateOrderRecordMapper;
import hello.service.ShopCreateOrderRecordService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * <p>
 * 下单记录表 服务实现类
 * </p>
 *
 * @author lv-success
 * @since 2018-09-10
 */
@Service
public class ShopCreateOrderRecordServiceImpl extends ServiceImpl<ShopCreateOrderRecordMapper, ShopCreateOrderRecord> implements ShopCreateOrderRecordService {

    @Async
    @Override
    public void saveOrderRecord(List<SimpleShopOrder> simpleShopOrderList, List<SimpleShopOrderDetail> shopOrderDetailList) {
        if (simpleShopOrderList == null||CollectionUtils.isEmpty(shopOrderDetailList)) {
            return;
        }
        List<ShopCreateOrderRecord> recordList = orderToOrderRecord2(simpleShopOrderList, shopOrderDetailList);
        insertBatch(recordList,200);
    }
    /**
     * @param shopOrderList
     * @param detailList
     * @return
     */
    private List<ShopCreateOrderRecord> orderToOrderRecord2(List<SimpleShopOrder> shopOrderList, List<SimpleShopOrderDetail> detailList) {
        List<ShopCreateOrderRecord> orderRecordList = new ArrayList<ShopCreateOrderRecord>();
        for (SimpleShopOrderDetail shopOrderDetail : detailList) {
            for (SimpleShopOrder shopOrder : shopOrderList) {
                if (shopOrderDetail.getcOrderid().equals(shopOrder.getcOrderid())) {
                    ShopCreateOrderRecord orderRecord = new ShopCreateOrderRecord();
                    String uuid = UUID.randomUUID().toString().replaceAll("-", "");
                    orderRecord.setId(uuid);
                    orderRecord.setcDetailid(shopOrderDetail.getcDetailid());
                    orderRecord.setcDealno(shopOrderDetail.getcDealno());
                    orderRecord.setGoodsId(shopOrderDetail.getcGoodsdetailid());
                    orderRecord.setGoodsName(shopOrderDetail.getcGoodsname());
                    orderRecord.setUserId(shopOrder.getcBuyerid());
                    orderRecord.setUserName(shopOrder.getBuyerName());
                    if (StringUtils.isBlank(shopOrder.getcBuyercompanyname())) {
                        orderRecord.setRegisterType(RegisterTypeEnum.PERSON.getKey());
                    } else {
                        orderRecord.setRegisterType(RegisterTypeEnum.COMPANY.getKey());
                    }
                    orderRecord.setOrigin(shopOrder.getcOrderorigin());
                    orderRecord.setOrderNum(shopOrderDetail.getiGoodsnum());
                    orderRecord.setCompanyId(shopOrder.getcCompanyid());
                    orderRecord.setCompanyName(shopOrder.getcCompanyname());
                    orderRecord.setBuyerCompanyname(shopOrder.getcBuyercompanyname());
                    orderRecord.setAdddate(shopOrder.getDtAdddate());
                    orderRecordList.add(orderRecord);
                }
            }
        }
        return orderRecordList;
    }

}
