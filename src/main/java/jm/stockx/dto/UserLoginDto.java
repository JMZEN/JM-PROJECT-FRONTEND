package jm.stockx.dto;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginDto {

    @Email(message = "Адрес электронной почты должен быть корректным")
    private String email;

    @NotBlank(message = "Значение пароля не должно быть null, пустым или состоять из одних лишь пробельных символов.")
    private String password;

    private Boolean rememberMe;

    public UserLoginDto(UserDto userDTO) {
        this.email = userDTO.getEmail();
        this.password = userDTO.getPassword();
    }
}
