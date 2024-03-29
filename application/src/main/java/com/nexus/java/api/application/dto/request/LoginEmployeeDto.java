package com.nexus.java.api.application.dto.request;

import com.nexus.java.api.application.mapper.Mapper;
import com.nexus.java.api.domain.model.LoginEmployeeModel;
import com.nexus.utils.Utils;
import com.nexus.validations.NonNullOrBlank;
import com.nexus.validations.ValidPassword;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginEmployeeDto {

    @CPF(message = "Cpf inválido")
    @NonNullOrBlank
    private String cpf;

    @NonNullOrBlank
    @ValidPassword
    private String password;

    public String getCpf() {
        return Utils.formatCPF(cpf);
    }

    public LoginEmployeeModel toDomain(){
        return Mapper.convert(this, LoginEmployeeModel.class);
    }
}
