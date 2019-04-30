package com.prag;

import com.prag.model.Springaree;
import com.prag.service.Springaree1ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class SpringareeController {

    @Autowired
    private Springaree1ServiceImpl service;

    @GetMapping("/springaree1")
    public List<Springaree> getAll() {
        return service.get();
    }

    @GetMapping("/springaree1/{id}")
    public Springaree getSpringaree(@PathVariable UUID id) {
        return service.get(id);
    }

    @PostMapping("/springaree1")
    public UUID addSpringaree(@RequestBody Springaree springaree) {
        return service.add(springaree);
    }

    @PutMapping("/springaree1/{id}")
    public UUID updateSpringaree(@RequestBody Springaree springaree, @PathVariable UUID id) {
        return service.update(springaree, id);
    }

    @DeleteMapping("/springaree1/{id}")
    public void deleteSpringaree(@PathVariable UUID id) {
         service.delete(id);
    }
}
