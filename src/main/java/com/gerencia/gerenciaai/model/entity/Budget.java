package com.gerencia.gerenciaai.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_budget")
public class Budget {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private User user;

    private String description;

    private Double budgetAmount;

}
