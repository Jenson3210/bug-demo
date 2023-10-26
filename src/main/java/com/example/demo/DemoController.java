package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

    private final DemoRepository repository;

    public DemoController(DemoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/interface")
    public DemoInterface getInterface() {
        return new DemoInterface() {};
    }

    @GetMapping("/projection")
    public DemoProjection getProjection() {
        if (repository.findById(1L).isEmpty()) {
            DemoEntity entity = new DemoEntity();
            entity.setId(1L);
            repository.save(entity);
        }
        return repository.findById(1L, DemoProjection.class);
    }
}
