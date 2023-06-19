package ddwu.spring.Dmd.service;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ddwu.spring.Dmd.domain.Order;

@Component
public class OrderFormValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return Order.class.isAssignableFrom(clazz);
	}

	public void validate(Object obj, Errors errors) {
		validateCreditCard((Order) obj, errors);
		//validateBillingAddress((Order) obj, errors);
		//validateShippingAddress((Order) obj, errors);
	}

	public void validateCreditCard(Order order, Errors errors) {
		errors.setNestedPath("order");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "creditCard", "CCN_REQUIRED", "FAKE (!) credit card number required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "expiryDate", "EXPIRY_DATE_REQUIRED", "Expiry date is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "cardType", "CARD_TYPE_REQUIRED", "Card type is required.");
		errors.setNestedPath("");
	}
	
}