package com.gerencia.gerenciaai.service;

import com.gerencia.gerenciaai.model.DTO.UserBasicDTO;
import com.gerencia.gerenciaai.model.entity.User;
import com.gerencia.gerenciaai.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Data
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper mapper = new ModelMapper();

    public UserBasicDTO getOne(Long userID){
        return conversor(userRepository.findById(userID).get());
    }

    public UserBasicDTO save (User user){
        try {
            userRepository.save(user);
            System.out.println(conversor(user));
            return conversor(user);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    private UserBasicDTO conversor(User user){
        UserBasicDTO userBasicDTO = new UserBasicDTO();
        mapper.map(user, userBasicDTO);
        return userBasicDTO;
    }

}
