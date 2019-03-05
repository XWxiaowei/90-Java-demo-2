package com.jay.es.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * @author xiang.wei
 */
@Data
public class TitleDTO implements Serializable {


    private Long id;

    private String titlename;

    private String description;


}
