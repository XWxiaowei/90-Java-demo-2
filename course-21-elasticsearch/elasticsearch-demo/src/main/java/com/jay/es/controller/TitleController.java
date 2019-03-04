package com.jay.es.controller;

import com.alibaba.fastjson.JSON;
import com.jay.es.dao.TitleRepository;
import com.jay.es.doc.TitleDTO;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author xiang.wei
 * @create 2019/3/4 14:28
 */
@RestController
public class TitleController {
    @Autowired
    private TitleRepository titleRepository;

    /**
     * 给索引添加数据
     * @return
     */
    @PostMapping("save")
    public String save(String titlename,String description) {
        TitleDTO titleDTO = new TitleDTO(System.currentTimeMillis(), titlename, description);
        titleRepository.save(titleDTO);
        return "success";
    }
    /**
     * 删除
     * @return
     */
    @PostMapping("delete")
    public String delete(Long id){
        titleRepository.deleteById(id);
        return  "success"  ;
    }

    @GetMapping("get")
    public String getTitle(String param) {
        List<TitleDTO> titleDTOList = new ArrayList<>();
        SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(QueryBuilders.matchQuery("titlename", param)).build();
        Page<TitleDTO> titleDTOS = titleRepository.search(searchQuery);
        if (titleDTOS != null) {
            Iterator<TitleDTO> titleDTOIter = titleDTOS.iterator();
            while (titleDTOIter.hasNext()) {
                TitleDTO titleDTO = titleDTOIter.next();
                titleDTOList.add(titleDTO);
            }
            return JSON.toJSONString(titleDTOList);
        }
        return "找不到数据";
    }

}
