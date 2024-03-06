package io.github.touhidion.protizogita.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserSignupRequest {
    @NotNull(message = "Full name is required.")
    @Size(min = 1, max = 100, message = "Invalid full name.")
    private String fullName;

    @NotNull(message = "Email is required.")
    @NotBlank(message = "Email is required.")
    @Email(message = "Invalid email.")
    private String email;

    @NotNull(message = "Password is required.")
    @NotBlank(message = "Password is required.")
    @Size(min = 6, max = 100, message = "Password length should be at least 6 characters.")
    private String password;
}
