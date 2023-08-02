package kroely.karinbackend.authentication.DTO.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SignUpRequest {
    @Email(message = "Your email format is invalid")
    private String email;
    @NotBlank(message = "You didn't type your password")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$",
            message = "Your password does not respect password's creation constraint")
    private String password;
}
