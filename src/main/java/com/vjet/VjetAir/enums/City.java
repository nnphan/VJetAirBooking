package com.vjet.VjetAir.enums;

public enum City {

    MIAMI(Country.USA),
    DALLAS(Country.USA),
    LONDON(Country.UK),
    HANOI(Country.VN),

    private final Country _country;
    City(Country country){
        this._country = country;
    }
}
