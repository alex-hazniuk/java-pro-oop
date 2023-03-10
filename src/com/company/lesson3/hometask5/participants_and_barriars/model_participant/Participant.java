package com.company.lesson3.hometask5.participants_and_barriars.model_participant;

import com.company.lesson3.hometask5.participants_and_barriars.opportunity.Jumpable;
import com.company.lesson3.hometask5.participants_and_barriars.opportunity.Runnable;

public abstract class Participant implements Runnable, Jumpable {
    private String name;
    private int maxRunLength;
    private int maxJumpHeight;

    public Participant(String name, int maxRunLength, int maxJumpHeight) {
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
    }

    public String getName() {
        return name;
    }

    public int getMaxRunLength() {
        return maxRunLength;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    @Override
    public void run(int length) {
        if (length >= 0 && length <= maxRunLength) {
            System.out.printf("%s %s ran sprint with length %dm.\n",
                    getClass().getSimpleName(), name, length);
        } else if (length > maxRunLength) {
            System.out.printf("%s %s did`t run sprint with length %dm. Just ran %dm.\n",
                    getClass().getSimpleName(), name, length, maxRunLength);
        } else {
            System.out.println("Length can`t be negative. Change parameter!");
        }
    }

    @Override
    public void jump(int height) {
        if (height >= 0 && height <= maxJumpHeight) {
            System.out.printf("%s %s jumped over wall with height %dm.\n",
                    getClass().getSimpleName(), name, height);
        } else if (height > maxJumpHeight) {
            System.out.printf("%s %s did`t jump over wall with height %dm. Just jumped %dm.\n",
                    getClass().getSimpleName(), name, height, maxJumpHeight);
        } else {
            System.out.println("Height can`t be negative. Change parameter!");
        }
    }
}
