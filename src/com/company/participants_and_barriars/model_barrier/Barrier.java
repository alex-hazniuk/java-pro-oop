package com.company.participants_and_barriars.model_barrier;

import com.company.participants_and_barriars.opportunity.Overcomable;

public abstract class Barrier implements Overcomable {
    private int parameter;

    public Barrier(int parameter) {
        this.parameter = parameter;
    }

    public int getParameter() {
        return parameter;
    }
}
