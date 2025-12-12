package com.example.SpringBootRest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobPost {

    @Id
    private int postId;

    private String postProfile;

    @Column(length = 2000)
    private String postDesc;

    private int reqExperience;

    @ElementCollection
    private List<String> technologies;
}
