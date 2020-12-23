package io.github.nvijaykarthik.flexifeature.resource;

import java.util.List;

import org.apache.commons.collections4.IterableUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.nvijaykarthik.flexifeature.domain.ICrudGeneral;
import io.github.nvijaykarthik.flexifeature.entity.Application;
import io.github.nvijaykarthik.flexifeature.repository.ApplicationRepository;

@RestController
@RequestMapping("/api/application")
public class ApplicationController implements ICrudGeneral<Application,Long> {

    public static final Logger log = LoggerFactory.getLogger(ApplicationController.class);

    @Autowired
    ApplicationRepository repository;

    @PostMapping
    @Override
    public Application add(@RequestBody Application a) {
        log.info("incomming {}",a);
        return repository.save(a);
    }

    @DeleteMapping
    @Override
    public void delete(@RequestBody Application a) {
        repository.delete(a);
    }

    @GetMapping("/all")
    @Override
    public List<Application> getAll() {
       return IterableUtils.toList(repository.findAll());
    }

    @PutMapping
    @Override
    public Application update(@RequestBody Application a) {
        return repository.save(a);
    }

    @GetMapping
    @Override
    public Application get(@RequestParam Long id) {
        return repository.findById(id).orElse(null);
    }

}
