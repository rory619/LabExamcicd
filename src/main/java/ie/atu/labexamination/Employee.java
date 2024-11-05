package ie.atu.labexamination;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Pattern(value = 1, message = "Needs to be a valid employee code")
    private String EmployeeCode;
    @NotNull(message = "Email cannot be null")
    private String email;
    @NotNull(message = "Name cannot be more than 100 characters")
    private String name;
    @NotNull(message = "Needs to be Manager, developer, or Analyst")
    private String position;
    @Min(value =0, message ="Salary must be positive")
    private double salary;
    @Min(value =0, message ="Date must be today")
    private double dateOfJoining;
}
