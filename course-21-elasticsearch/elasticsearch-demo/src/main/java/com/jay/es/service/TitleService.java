package com.jay.es.service;

import com.jay.es.dao.TitleRepository;
import com.jay.es.doc.TitleDocument;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by xiang.wei on 2019/3/5
 *
 * @author xiang.wei
 */
@Service
public class TitleService {
    @Autowired
    private TitleRepository titleRepository;

    /**
     * 创建索引
     * @param titlename
     * @param description
     */
    public void save(Long id,String titlename,String description) throws NoSuchAlgorithmException {
        TitleDocument titleDocument = new TitleDocument(id, titlename+id, description+id);
        titleRepository.save(titleDocument);
    }


    /**
     * 删除索引数据
     * @param id
     * @return
     */
    public boolean delete(Long id) {
        titleRepository.deleteById(id);
        return true;
    }

    /**
     * 删除索引
     * @return
     */
    public boolean deleteDoc() {
        titleRepository.deleteAll();
        return true;
    }
    /**
     * 查询所有的文章
     * @param searchContent
     * @return
     */
    public List<TitleDocument> getTitle(String searchContent) {
        QueryStringQueryBuilder builder = new QueryStringQueryBuilder(searchContent);
        System.out.println("查询的语句:"+builder);
        Iterable<TitleDocument> searchResult = titleRepository.search(builder);
        Iterator<TitleDocument> iterator = searchResult.iterator();
        List<TitleDocument> list=new ArrayList<>();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        return list;
    }

    /**
     * 分页查询
     * @param pageNumber
     * @param pageSize
     * @param searchContent
     * @return
     */
    public List<TitleDocument> pageTitle(Integer pageNumber, Integer pageSize, String searchContent) {
//        分页参数
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);
        QueryStringQueryBuilder queryBuilder = new QueryStringQueryBuilder(searchContent);
        NativeSearchQuery searchQuery = new NativeSearchQueryBuilder().withPageable(pageRequest).withQuery(queryBuilder).build();
        System.out.println("查询的语句：" + searchQuery.getQuery().toString());
        Page<TitleDocument> search = titleRepository.search(searchQuery);
        return search.getContent();
    }

}
