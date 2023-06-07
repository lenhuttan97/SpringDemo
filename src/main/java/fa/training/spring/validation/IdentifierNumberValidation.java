package fa.training.spring.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class IdentifierNumberValidation implements ConstraintValidator<IdentifierNumber, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value == null) {
			return false;
		}
		
		return value.matches("\\d{10}") || value.matches("\\d{12}");
	}

}
