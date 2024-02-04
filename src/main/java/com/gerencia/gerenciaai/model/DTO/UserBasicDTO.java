package com.gerencia.gerenciaai.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserBasicDTO {
    private Long id;
    private String name;
    private String email;
}
