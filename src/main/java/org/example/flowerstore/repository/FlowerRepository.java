package org.example.flowerstore.repository;

import org.example.flowerstore.model.Flower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FlowerRepository extends JpaRepository<Flower, Long> {

}