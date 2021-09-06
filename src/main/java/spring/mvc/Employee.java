package spring.mvc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import spring.mvc.validation.CheckEmail;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
public class Employee {

    @Size(min = 2, message = "name must be min 2 symbols")
    private String name;
    @NotBlank(message = "surname is required field")
    private String surname;
    private int salary;
    private String department;
    private String carBrand;
    private String[] languages;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XX-XX")
    private String phoneNumber;
    @CheckEmail
    private String email;

    public Employee() {
    }
}
