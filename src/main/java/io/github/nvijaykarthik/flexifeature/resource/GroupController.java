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
import io.github.nvijaykarthik.flexifeature.entity.ApplicationGroup;
import io.github.nvijaykarthik.flexifeature.repository.GroupRepository;

@RestController
@RequestMapping("/api/groups")
public class GroupController implements ICrudGeneral<ApplicationGroup, Long> {


    @Autowired
    private GroupRepository repo;

    @Override
    @GetMapping("/all")
    public List<ApplicationGroup> getAll() {
        return IterableUtils.toList(repo.findAll());
    }

    @GetMapping
    @Override
    public ApplicationGroup get(@RequestParam Long id) {
        return repo.findById(id).orElse(null);
    }

    @PostMapping
    @Override
    public ApplicationGroup add(@RequestBody ApplicationGroup t) {
        return repo.save(t);
    }

    @PutMapping
    @Override
    public ApplicationGroup update(@RequestBody ApplicationGroup t) {
        return repo.save(t);
    }

    @DeleteMapping
    @Override
    public void delete(@RequestBody ApplicationGroup t) {
        repo.delete(t);
    }
    
}
