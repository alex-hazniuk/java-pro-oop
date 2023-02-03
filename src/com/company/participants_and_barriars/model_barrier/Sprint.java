package com.company.participants_and_barriars.model_barrier;

import com.company.participants_and_barriars.model_barrier.Barrier;

public class Sprint extends Barrier {
    public Sprint(int parameter) {
        super(parameter);
    }

    @Override
    public String overcome() {
        return  "sprint";
    }
}
