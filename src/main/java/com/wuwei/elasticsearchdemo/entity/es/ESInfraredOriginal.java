package com.wuwei.elasticsearchdemo.entity.es;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @BelongsProject: rtls
 * @BelongsPackage: com.tgy.rtls.data.entity.es
 * @Author: wuwei
 * @CreateTime: 2023-10-19 05:12
 * @Description: TODO
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document (indexName = "infrared-original")
public class ESInfraredOriginal {
    @Id
    private String id;
    @Field(type = FieldType.Keyword)
    private String timestamp;
    @Field(type = FieldType.Keyword)
    private String gatewayNum;
    @Field(type = FieldType.Keyword)
    private String infraredNum;
    @Field(type = FieldType.Integer)
    private Integer state;
    @Field(type = FieldType.Integer)
    private Integer count;
    @Field(type = FieldType.Integer)
    private Integer rssi;
    @Field(type = FieldType.Integer)
    private Integer power;
    @Field(type = FieldType.Integer)
    private Integer appearCount=0;
    @Field(type = FieldType.Integer)
    private Integer timePoor=0;

}
