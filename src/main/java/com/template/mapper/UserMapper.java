package com.template.mapper;

import com.template.dto.UpdateUserDto;
import com.template.dto.UserDto;
import com.template.entity.User;
import com.template.enums.Roles;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {


  public UserDto toDto(User user) {
    return new UserDto(
            user.getUserId(),
            user.getFirstName(),
            user.getLastName(),
            user.getEmail(),
            user.getPhoneNumber(),
            user.getCity(),
            user.getAddress(),
            user.getRole() != null ? user.getRole() : Roles.USER
    );
  }
  public User toEntity(UserDto dto) {
    return User.builder()
            .firstName(dto.firstName())
            .lastName(dto.lastName())
            .email(dto.email())
            .phoneNumber(dto.phoneNumber())
            .city(dto.city())
            .address(dto.address())
            .role(dto.role() != null ? dto.role() : Roles.USER)
            .build();
  }
  public void updateUser(UpdateUserDto updateUserDto, User user) {
    if (updateUserDto.firstName() != null) {
      user.setFirstName(updateUserDto.firstName());
    }
    if (updateUserDto.lastName() != null) {
      user.setLastName(updateUserDto.lastName());
    }
    if (updateUserDto.email() != null) {
      user.setEmail(updateUserDto.email());
    }
    if (updateUserDto.phoneNumber() != null) {
      user.setPhoneNumber(updateUserDto.phoneNumber());
    }
    if (updateUserDto.city() != null) {
      user.setCity(updateUserDto.city());
    }
    if (updateUserDto.address() != null) {
      user.setAddress(updateUserDto.address());
    }
  }
  public UpdateUserDto toUpdateDto(User user) {
    return new UpdateUserDto(
            user.getFirstName(),
            user.getLastName(),
            user.getEmail(),
            user.getPhoneNumber(),
            user.getCity(),
            user.getAddress()
    );
  }
}
