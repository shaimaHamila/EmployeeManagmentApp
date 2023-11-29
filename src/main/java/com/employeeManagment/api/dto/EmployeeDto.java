package com.employeeManagment.api.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeDto {
        private Long id;
        private String firstName;
        private String secondName;
        private String email;
        private String psw;

}
