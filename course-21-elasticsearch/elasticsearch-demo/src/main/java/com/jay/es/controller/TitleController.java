package com.jay.es.controller;

import com.alibaba.fastjson.JSON;
import com.jay.es.dao.TitleRepository;
import com.jay.es.doc.TitleDocument;
import com.jay.es.service.TitleService;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.NoSuchAlgorithmException;
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
    private TitleService titleService;

    /**
     * 给索引添加数据
     * @return
     */
    @PostMapping("save")
    public String save(Long id,String titlename,String description) throws NoSuchAlgorithmException {
        titleService.save(id,titlename,description);
        return "success";
    }
    /**
     * 删除
     * @return
     */
    @PostMapping("delete")
    public String delete(Long id){
        titleService.delete(id);
        return  "success"  ;
    }

    @PostMapping("deleteDoc")
    public String deleteDoc(){
        titleService.deleteDoc();
        return  "success"  ;
    }

    @GetMapping("get")
    public List<TitleDocument> getTitle(String param) {
        List<TitleDocument> titleDocumentList = titleService.getTitle(param);
        return titleDocumentList;
    }

    @GetMapping("page")
    public List<TitleDocument> pageTitle(Integer pageNumber, Integer pageSize, String searchContent) {
        List<TitleDocument> documentList = titleService.pageTitle(pageNumber, pageSize, searchContent);
        return documentList;
    }

}
