package be.thomas.ClassRoomV1.validation.validators;

import jakarta.validation.Constraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;

@Component
public class validator implements ConstraintValidator<Constraint, validator> {


    @Override
    public void initialize(Constraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(validator value, ConstraintValidatorContext context) {
        return false;
    }
}
