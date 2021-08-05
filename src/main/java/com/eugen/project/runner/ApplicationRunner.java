package com.eugen.project.runner;

import com.eugen.project.entity.BeeCards;
import com.eugen.project.entity.BicycleCards;
import com.eugen.project.entity.Cards;
import com.eugen.project.entity.TallyHoCards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplicationRunner {

    public static void main(String[] args) {
        Cards bee = new BeeCards("Bee Originals", "Bee", "Originals",
                25, 3, 400);
        Cards tallyho = new TallyHoCards("TallyHo CircleBack", "TallyHo", "CircleBack",
                5000);
        Cards bicycle = new BicycleCards("Bicycle Standart", "Bicycle", "Standart",
                7, 3, 100000);


        List<Cards> cards = new ArrayList<>(Arrays.asList(bee, tallyho, bicycle));

        cards.stream().forEach(System.out::println);
    }
}
