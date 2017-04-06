package com.serenum.android.workout;

/**
 * Created by Serenum on 07.04.2017.
 */

public class Workout {

    private String name;
    private String description;

    public Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public static Workout[] workouts = {
            new Workout("Подъем с переворотом", "20 подходов\n1повторения\n5 мин отдых"),
            new Workout("Отжимания", "40 подходов\n5повторения\n2 мин отдых"),
            new Workout("Подтягивание", "5 подходов\n3повторения\n1 мин отдых"),
    };

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
