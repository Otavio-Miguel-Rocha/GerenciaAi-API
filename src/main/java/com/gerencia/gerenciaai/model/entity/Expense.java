package com.gerencia.gerenciaai.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.time.LocalDateTime;

@Data
@Entity(name = "tb_expense")
@AllArgsConstructor
@NoArgsConstructor
public class Expense {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Category category;

    private Double amount;

    private LocalDateTime date;

    private String description;

    @Lob
    @Column(name = "receipt",
            columnDefinition = "BLOB")
    private byte[] receipt;

}
