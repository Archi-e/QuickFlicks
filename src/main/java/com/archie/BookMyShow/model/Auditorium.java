package com.archie.BookMyShow.model;

import com.archie.BookMyShow.model.constants.AuditoriumFeature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Auditorium extends BaseModel{
    private String name;
    private int capacity;
    @OneToMany
    private List<Show> shows;
    @OneToMany
    private List<Seat> seats;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<AuditoriumFeature> auditoriumFeatures;

    public Auditorium(){

    }
    public Auditorium(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}
