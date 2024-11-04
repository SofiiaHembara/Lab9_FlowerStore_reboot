package org.example.flowerstore.decorator;

import org.example.flowerstore.model.Flower;

public abstract class AbstractDecorator extends Flower {
    protected Flower decoratedFlower;

    public AbstractDecorator(Flower decoratedFlower) {
        this.decoratedFlower = decoratedFlower;
    }

    @Override
    public Long getId() {
        return decoratedFlower.getId();
    }

    @Override
    public String getName() {
        return decoratedFlower.getName();
    }

    @Override
    public String getColor() {
        return decoratedFlower.getColor();
    }

    @Override
    public void setId(Long id) {
        decoratedFlower.setId(id);
    }

    @Override
    public void setName(String name) {
        decoratedFlower.setName(name);
    }

    @Override
    public void setColor(String color) {
        decoratedFlower.setColor(color);
    }

}
