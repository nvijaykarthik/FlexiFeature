package io.github.nvijaykarthik.flexifeature.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.github.nvijaykarthik.flexifeature.entity.Application;

@Repository
public interface ApplicationRepository extends CrudRepository<Application,Long>{
    
}
