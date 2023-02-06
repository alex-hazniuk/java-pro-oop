package com.company.lesson3.participants_and_barriars.model_barrier;

public class Sprint extends Barrier {
    public Sprint(int parameter) {
        super(parameter);
    }

    @Override
    public String overcome() {
        return "sprint";
    }
}
