package com.company.lesson3.hometask5.participants_and_barriars.model_barrier;

public class Wall extends Barrier {
    public Wall(int parameter) {
        super(parameter);
    }

    @Override
    public String overcome() {
        return "wall";
    }
}
