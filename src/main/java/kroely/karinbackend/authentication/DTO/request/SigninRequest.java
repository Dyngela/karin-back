package kroely.karinbackend.authentication.DTO.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SigninRequest {
    @Email(message = "Your email format is invalid")
    private String email;
    @NotBlank(message = "You didn't type your password")
    private String password;
}
