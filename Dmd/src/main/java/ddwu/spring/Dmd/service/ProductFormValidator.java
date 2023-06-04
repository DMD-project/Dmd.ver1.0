package ddwu.spring.Dmd.service;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ddwu.spring.Dmd.controller.ProductForm;

@Component
public class ProductFormValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return ProductForm.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		
		System.out.println("product form validator");
		
		ProductForm prodForm = (ProductForm)target;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "price", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "content", "required");
		
//		if(prodForm.getContent().length() > 0 && prodForm.getContent().length() < 10) {
//			errors.rejectValue("content", "tooShortContent");
//		}
		return;
	}
	

}
