package com.wuwei.elasticsearchdemo.service.es.impl;

import com.wuwei.elasticsearchdemo.entity.es.ESInfraredOriginal;
import com.wuwei.elasticsearchdemo.service.es.ESInfraredOriginalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @BelongsProject: rtls
 * @BelongsPackage: com.tgy.rtls.data.service.ES.impl
 * @Author: wuwei
 * @CreateTime: 2023-10-20 16:46
 * @Description: TODO
 * @Version: 1.0
 */
@Service
@Slf4j
public class ESInfraredOriginalImpl {

    @Autowired
    private ESInfraredOriginalService esInfraredOriginalService;

    public void addOriginal(ESInfraredOriginal original){
        esInfraredOriginalService.save(original);
    }

}
