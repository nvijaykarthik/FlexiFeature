package io.github.nvijaykarthik.flexifeature.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.nvijaykarthik.flexifeature.entity.Features;
import io.github.nvijaykarthik.flexifeature.repository.FeaturesRepository;

@RestController
@RequestMapping("/api/features")
public class FeatureController {

    private static final Logger logger = LoggerFactory.getLogger(FeatureController.class);

    @Autowired
    FeaturesRepository repo;

    @GetMapping(path = "/all")
    public Page<Features> getAllFeatures(@RequestParam(name = "page",required = false) Integer pageNo,@RequestParam(name = "size",required = false) Integer size) {
        logger.info("Getting all the features page no:{}, page size:{}",pageNo,size);
        if(null==size)
            size=15;
        if(null==pageNo)
            pageNo=0;
        Pageable page= PageRequest.of(pageNo, size);
        return repo.findAll(page);
    }
}
