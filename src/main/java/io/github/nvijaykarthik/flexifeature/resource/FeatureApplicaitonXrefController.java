package io.github.nvijaykarthik.flexifeature.resource;

import java.util.List;

import org.apache.commons.collections4.IterableUtils;
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
import io.github.nvijaykarthik.flexifeature.entity.FeatureApplicaitonXref;
import io.github.nvijaykarthik.flexifeature.repository.FeatureApplicaitonXrefRepository;

@RestController
@RequestMapping("/api/featureAppXref")
public class FeatureApplicaitonXrefController implements ICrudGeneral<FeatureApplicaitonXref, Long> {

    @Autowired
    FeatureApplicaitonXrefRepository repo;

    @Override
    @GetMapping("/all")
    public List<FeatureApplicaitonXref> getAll() {
        return IterableUtils.toList(repo.findAll());
    }

    @Override
    @GetMapping
    public FeatureApplicaitonXref get(@RequestParam Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    @PostMapping
    public FeatureApplicaitonXref add(@RequestBody FeatureApplicaitonXref t) {
        
        return repo.save(t);
    }

    @Override
    @PutMapping
    public FeatureApplicaitonXref update(@RequestBody FeatureApplicaitonXref t) {
        
        return repo.save(t);
    }

    @Override
    @DeleteMapping
    public void delete(@RequestBody FeatureApplicaitonXref t) {
        repo.delete(t);
    }
    
}
