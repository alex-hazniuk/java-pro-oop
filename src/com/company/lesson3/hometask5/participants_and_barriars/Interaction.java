package com.company.lesson3.hometask5.participants_and_barriars;

import com.company.lesson3.hometask5.participants_and_barriars.model_barrier.Barrier;
import com.company.lesson3.hometask5.participants_and_barriars.model_participant.Participant;

public class Interaction {
    public void interact(Participant[] participants, Barrier[] barriers) {
        if (participants != null && barriers != null
                && participants.length > 0 && barriers.length > 0) {
            for (Participant participant : participants) {
                if (participant == null) {
                    continue;
                }
                for (Barrier barrier : barriers) {
                    if (barrier == null) {
                        continue;
                    }
                    if (barrier.overcome().equals("wall")) {
                        participant.jump(barrier.getParameter());
                        if (barrier.getParameter() > participant.getMaxJumpHeight()) {
                            break;
                        }
                    }
                    if (barrier.overcome().equals("sprint")) {
                        participant.run(barrier.getParameter());
                        if (barrier.getParameter() > participant.getMaxRunLength()) {
                            break;
                        }
                    }
                }
            }
        } else {
            System.out.println("Competition impossible! No participants or barriers");
        }
    }
}
