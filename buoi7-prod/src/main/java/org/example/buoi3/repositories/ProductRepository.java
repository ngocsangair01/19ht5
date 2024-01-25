package org.example.buoi3.repositories;

import org.example.buoi3.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Category,Long> {
}
