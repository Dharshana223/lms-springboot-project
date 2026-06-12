package com.lms_project.QuizModule;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long studentId;

    private Integer score;

    private LocalDateTime submittedAt;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;
}