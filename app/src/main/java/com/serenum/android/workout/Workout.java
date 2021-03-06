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
            new Workout("Подъем с переворотом", "20 подходов\n1 повторение\n5 мин. отдых"),
            new Workout("Отжимания", "40 подходов\n5 повторений\n2 мин. отдых"),
            new Workout("Подтягивания", "5 подходов\n3 повторения\n1 мин. отдых"),
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
