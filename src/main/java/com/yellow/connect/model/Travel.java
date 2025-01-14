package com.yellow.connect.model;

import com.yellow.connect.model.enums.TravelType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Travel extends Interest{

    @Id
    @GeneratedValue
    private Long id;
    private String place;
    private TravelType type;

    @OneToOne
    private Interest interest;
}
