package com.jay.ShopAreaDomain.service.impl;

import com.jay.ShopAreaDomain.service.ShopAreaDomainService;
import com.jay.model.ShopAreaDomain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;
import java.util.UUID;

/**
 * @author xiang.wei
 * @create 2018/10/24 16:14
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ShopAreaDomainServiceImplTest {
    @Autowired
    private ShopAreaDomainService shopAreaDomainService;
    @Test
    public void insertAreaDomain() {
////        1.返回所有商城站点
//        Map<Object, Object> areaDomainMap = AreaType.typeMap1;
//        Map<Object, Object> pingyinMap = AreaType.typeMap3;
//        Map<Object, Object> shopStationIsOnlineMap = AreaType.shopStationIsOnlineMap;
//        for (Object key : areaDomainMap.keySet()) {
//            ShopAreaDomain shopAreaDomain = new ShopAreaDomain();
//            shopAreaDomain.setId(UUID.randomUUID().toString().replace("-",""));
//            shopAreaDomain.setAreaId((String) key);
//            shopAreaDomain.setAreaDomain(((String) areaDomainMap.get(key)).split(";")[1]);
//            shopAreaDomain.setAreaPinyin((String )pingyinMap.get(key));
//            shopAreaDomain.setIsopen((String)shopStationIsOnlineMap.get(key));
//            shopAreaDomainService.insert(shopAreaDomain);
//        }
    }
}