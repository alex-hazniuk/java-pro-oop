package com.company.participants_and_barriars.model_barrier;

import com.company.participants_and_barriars.service.BarrierService;

public abstract class Barrier implements BarrierService {
    private int parameter;

    public Barrier(int parameter) {
        this.parameter = parameter;
    }

    public int getParameter() {
        return parameter;
    }
}
