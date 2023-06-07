package fa.training.spring.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneValidation implements ConstraintValidator<Phone, String>{
	
	public void initializa(Phone paramA) {
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value == null) {
			return false;
		}

		return value.matches("\\d{10}");
	}

}
