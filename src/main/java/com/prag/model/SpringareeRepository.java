package com.prag.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SpringareeRepository extends JpaRepository<Springaree, Long> {
        Optional<Springaree> findOneById(UUID uuid);
        void deleteById(UUID id);
}

