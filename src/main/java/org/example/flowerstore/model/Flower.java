package org.example.flowerstore.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "flowers")
public class Flower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;

    public void setColor(String color) {
    }

    public String getColor() {
    }
}
