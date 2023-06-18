package ddwu.spring.Dmd.service;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ddwu.spring.Dmd.controller.ProductForm;
import ddwu.spring.Dmd.domain.Product;

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
		Product product = prodForm.getProduct();
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "product.name", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "product.price", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "product.content", "required");
		
//		if(prodForm.getContent().length() > 0 && prodForm.getContent().length() < 10) {
//			errors.rejectValue("content", "tooShortContent");
//		}
		return;
	}
	

}
