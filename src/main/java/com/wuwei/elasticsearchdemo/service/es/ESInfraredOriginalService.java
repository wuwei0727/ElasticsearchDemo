package com.wuwei.elasticsearchdemo.service.es;

import com.wuwei.elasticsearchdemo.entity.es.ESInfraredOriginal;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @BelongsProject: rtls
 * @BelongsPackage: com.tgy.rtls.data.service.ES
 * @Author: wuwei
 * @CreateTime: 2023-10-16 17:28
 * @Description: TODO
 * @Version: 1.0
 */
public interface ESInfraredOriginalService extends ElasticsearchRepository<ESInfraredOriginal, Integer> {
}
