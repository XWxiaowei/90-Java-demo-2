package com.jay.es.doc;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 *  *设置索引名、类型
 *  * 设置字段的 mapping 以及 所采用的分词器 注：实体采用的ik 分词。
 *  *   1.如需其他分词器需修改字段上的：analyzer、searchAnalyzer
 *  *   2.在安装的elasticsearch 导入其他分词
 *  *   3.如使用原始分词器，可将字段上注解去掉
 * @author xiang.wei
 */
@Data
@Document(indexName = "titleindex",type = "_doc")
public class TitleDTO implements Serializable {

    /**
     *
     */
    @Id
    private Long id;

    /**
     *  选中ik 分词器
     */
    @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_smart")
    private String titlename;

    @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_smart")
    private String description;

    public TitleDTO() {
    }

    public TitleDTO(Long id, String titlename, String description) {
        this.id = id;
        this.titlename = titlename;
        this.description = description;
    }
}
