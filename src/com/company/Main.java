package com.company;

import com.company.figures.Circle;
import com.company.figures.Figure;
import com.company.figures.Square;
import com.company.figures.SquareCounter;
import com.company.figures.Triangle;
import com.company.participants_and_barriars.Interaction;
import com.company.participants_and_barriars.model_barrier.Barrier;
import com.company.participants_and_barriars.model_barrier.Sprint;
import com.company.participants_and_barriars.model_barrier.Wall;
import com.company.participants_and_barriars.model_participant.Cat;
import com.company.participants_and_barriars.model_participant.Human;
import com.company.participants_and_barriars.model_participant.Participant;
import com.company.participants_and_barriars.model_participant.Robot;

public class Main {
    public static void main(String[] args) {
        SquareCounter squareCounter = new SquareCounter();
        Figure circle = new Circle(2);
        Figure triangle = new Triangle(5, 6, 8);
        Figure square = new Square(5);
        Figure[] figures = {circle, triangle, square};
        squareCounter.getSumSquares(figures);

        Interaction interaction = new Interaction();
        Participant cat = new Cat("Vaska", 50, 2);
        Participant human = new Human("Alex", 500, 5);
        Participant robot = new Robot("Verder", 1000, 10);
        Barrier sprint = new Sprint(550);
        Barrier wall = new Wall(11);
        Participant[] participants = {cat, human, robot};
        Barrier[] barriers = {sprint, wall};
        interaction.interact(participants, barriers);
    }
}
