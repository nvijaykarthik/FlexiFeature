package io.github.nvijaykarthik.flexifeature.resource;

import java.util.List;

import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.nvijaykarthik.flexifeature.domain.ICrudGeneral;
import io.github.nvijaykarthik.flexifeature.entity.Group;
import io.github.nvijaykarthik.flexifeature.repository.GroupRepository;

@RestController
@RequestMapping("/api/groups")
public class GroupController implements ICrudGeneral<Group, Long> {


    @Autowired
    private GroupRepository repo;

    @Override
    @GetMapping("/all")
    public List<Group> getAll() {
        return IterableUtils.toList(repo.findAll());
    }

    @GetMapping
    @Override
    public Group get(Long id) {
        return repo.findById(id).orElse(null);
    }

    @PostMapping
    @Override
    public Group add(Group t) {
        return repo.save(t);
    }

    @PutMapping
    @Override
    public Group update(Group t) {
        return repo.save(t);
    }

    @DeleteMapping
    @Override
    public void delete(Group t) {
        repo.delete(t);
    }
    
}
