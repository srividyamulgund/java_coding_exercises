package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {

        String cityValue = person.getCity();
        if (cityValue == "Manchester")
            return true;
        else
            return false;
    }

    public boolean canWatchFilm(Person person, int ageLimit) {

        if (ageLimit >= 18)
            return true;
        else
            return false;
    }

}
