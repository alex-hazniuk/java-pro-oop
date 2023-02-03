package com.company.participants_and_barriars.model_barrier;

import com.company.participants_and_barriars.model_barrier.Barrier;

public class Wall extends Barrier {
    public Wall(int parameter) {
        super(parameter);
    }

    @Override
    public String overcome() {
        return "wall";
    }
}
