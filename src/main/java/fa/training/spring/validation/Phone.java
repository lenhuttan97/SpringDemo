package fa.training.spring.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;


@Documented
@Constraint(validatedBy = PhoneValidation.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Phone {

	String message() default "Sorry, phone error";
	
//	String massage() default "{Phone}";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
}
