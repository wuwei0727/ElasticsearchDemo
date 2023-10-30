package com.wuwei.elasticsearchdemo.controller;

import com.wuwei.elasticsearchdemo.entity.es.ESInfraredOriginal;
import com.wuwei.elasticsearchdemo.service.es.ESInfraredOriginalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: rtls
 * @BelongsPackage: com.tgy.rtls.web.controller.ES
 * @Author: wuwei
 * @CreateTime: 2023-10-16 17:33
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
@RequestMapping (value = "/es")
public class EsTeseController {
    @Autowired
    private ESInfraredOriginalService esBookRepository;

    @PutMapping ("/addOriginal")
    public Object addOriginal(){
        ESInfraredOriginal original = new ESInfraredOriginal();
        original.setTimestamp("2023");
        original.setGatewayNum("22");
        original.setInfraredNum("214");
        original.setState(0);
        original.setCount(11);
        original.setRssi(22);
        original.setPower(0);
        esBookRepository.save(original);
        return esBookRepository.count();
    }
}
