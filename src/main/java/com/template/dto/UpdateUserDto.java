package com.template.dto;

import jakarta.validation.constraints.Pattern;

import static com.template.constants.ValidationConstants.EMAIL_REGEXP;
import static com.template.constants.ValidationConstants.WRONG_EMAIL_FORMAT;

public record UpdateUserDto(String firstName,
                            String lastName,
                            @Pattern(regexp = EMAIL_REGEXP, message = WRONG_EMAIL_FORMAT)
                            String email,
                            String phoneNumber,
                            String city,
                            String address
) {
}
