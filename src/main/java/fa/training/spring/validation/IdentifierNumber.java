package fa.training.spring.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Constraint(validatedBy = IdentifierNumberValidation.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface IdentifierNumber {

	String message() default "Sorry, ID error";
	
//	String massage() default "{Phone}";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
}
