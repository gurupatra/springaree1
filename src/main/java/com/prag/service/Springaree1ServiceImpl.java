package com.prag.service;

import com.prag.exception.SpringareeNotFoundException;
import com.prag.model.Springaree;
import com.prag.model.SpringareeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;


@Service
public class Springaree1ServiceImpl {
    private static Logger LOG = LoggerFactory.getLogger("Springaree1ServiceImpl");

    @Autowired
    private SpringareeRepository repository;

    public UUID add(Springaree springaree) {
        return repository.save(springaree).getId();
    }

    public UUID update(Springaree newSpringaree, UUID id){
        repository.findOneById(id).map(springaree -> {
            springaree.setName(newSpringaree.getName());
            repository.save(springaree);
            return null;
        });
        return id;
    }

    @Transactional
    public void delete(UUID id) {
        repository.deleteById(id);
    }


    public Springaree get(UUID id) {
        return repository.findOneById(id).orElseThrow(() -> new SpringareeNotFoundException(id.toString()));
    }

    public List<Springaree> get() {
        return repository.findAll();
    }
}
