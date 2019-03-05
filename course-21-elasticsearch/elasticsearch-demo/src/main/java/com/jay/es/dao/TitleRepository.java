package com.jay.es.dao;

import com.jay.es.doc.TitleDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * @author xiang.wei
 * @create 2019/3/4 14:26
 */
@Component
public interface TitleRepository extends ElasticsearchRepository<TitleDocument,Long> {
}
