package com.brunosantos.dscatalog.dto;

import com.brunosantos.dscatalog.services.validation.UserInsertValid;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@UserInsertValid
public class UserInsertDTO extends UserDTO {

    @NotBlank
    private String password;
}
