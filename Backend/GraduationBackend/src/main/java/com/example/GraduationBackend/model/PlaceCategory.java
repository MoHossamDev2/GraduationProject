package com.example.GraduationBackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity(name = "place_category")
public class PlaceCategory {

    @Id
    private Integer id ;

    @ManyToOne
    @JoinColumn(name = "place_id")
    private Place place ;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category ;

    private Double price ;
}
