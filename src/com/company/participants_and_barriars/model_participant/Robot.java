package com.company.participants_and_barriars.model_participant;

public class Robot extends Participant {
    public Robot(String name, int maxRunLength, int maxJumpHeight) {
        super(name, maxRunLength, maxJumpHeight);
    }

    @Override
    public void run(int length) {
        super.run(length);
    }

    @Override
    public void jump(int height) {
        super.jump(height);
    }
}
