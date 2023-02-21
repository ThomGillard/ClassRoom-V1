package be.thomas.ClassRoomV1.validation.constraints;

import be.thomas.ClassRoomV1.validation.validators.validator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = validator.class)
public @interface constraint {


    int value() default 0;
    Class objet() default Object.class;
    String message() default "constraint text";
    Class<?>[] groups() default {};
    Class<? extends Payload> [] payload() default {};
}
