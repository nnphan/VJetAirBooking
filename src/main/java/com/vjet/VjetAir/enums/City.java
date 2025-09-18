package com.vjet.VjetAir.enums;
import lombok.Getter;

@Getter
public enum City {

    // Nigeria
    MIAMI(Country.USA),
    DALLAS(Country.USA),

    LONDON(Country.UK),
    HANOI(Country.VN),  // USA

    // UK
    LEEDS(Country.UK);

    private final Country country;

    City(Country country) {
        this.country = country;
    }
}