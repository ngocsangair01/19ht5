package org.example.buoi3.repositories;

import org.example.buoi3.models.Category;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Query("select c from Category c where :name is null or c.name like concat('%',:name,'%') ")
    List<Category> getListCategory(@Param("name") String name, Pageable pageable);
}
