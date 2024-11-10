package org.example.flowerstorereboot.repository;

import org.example.flowerstorereboot.model.Flower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FlowerRepository extends JpaRepository<Flower, Long> {

}