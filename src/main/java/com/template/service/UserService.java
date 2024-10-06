package com.template.service;

import com.template.dto.UpdateUserDto;
import com.template.dto.UserDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUserById(Long userId);
    Page<UserDto> getAllUsers(Pageable pageable);

    UpdateUserDto updateUserFields(Long userId, UpdateUserDto updateUserDto);
    void deleteUser(Long userId);

}
