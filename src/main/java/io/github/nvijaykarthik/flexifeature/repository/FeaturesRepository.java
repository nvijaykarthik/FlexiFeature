package io.github.nvijaykarthik.flexifeature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import io.github.nvijaykarthik.flexifeature.entity.Features;

@Repository
public interface FeaturesRepository extends JpaRepository<Features,Long>,JpaSpecificationExecutor<Features> {
    
}
