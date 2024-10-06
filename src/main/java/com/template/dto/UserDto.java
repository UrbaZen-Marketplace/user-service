package com.template.dto;

import com.template.enums.Roles;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import static com.template.constants.ValidationConstants.EMAIL_REGEXP;
import static com.template.constants.ValidationConstants.WRONG_EMAIL_FORMAT;

public record UserDto(
        Long userId,
        String firstName,
        String lastName,
        @NotNull
        @Pattern(regexp = EMAIL_REGEXP, message = WRONG_EMAIL_FORMAT)
        String email,
        String phoneNumber,
        String city,
        String address,
        Roles role
) {
}
