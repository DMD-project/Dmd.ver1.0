package ddwu.spring.Dmd.service;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ddwu.spring.Dmd.controller.ProfileForm;
import ddwu.spring.Dmd.domain.Profile;

@Component
public class ProfileFormValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Profile.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		
		ProfileForm profileForm = (ProfileForm) obj;
		Profile profile = profileForm.getProfile();
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "profile.id", "ID_REQUIRED", "ID is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "profile.name", "NAME_REQUIRED", "Name is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "profile.pw", "PW_REQUIRED", "Password is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "profile.addr", "ADDR_REQUIRED", "Address is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "profile.zipcode", "ZIPCODE_REQUIRED", "Zipcode is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "profile.phone", "PHONE_REQUIRED", "Phone Number is required");
	
		/*
		if (profileForm.isNewProfile()) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "profile.id", "ID_REQUIRED", "ID is required.");
			if (profile.getPw() == null || profile.getPw().length() < 1 ||
					!profile.getPw().equals(profileForm.getRepeatedPassword())) {
				errors.reject("PASSWORD_MISMATCH",
					 "Passwords did not match or were not provided. Matching passwords are required.");
			}
		} else if (profile.getPw() != null && profile.getPw().length() > 0) {
			if (!profile.getPw().equals(profileForm.getRepeatedPassword())) {
				errors.reject("PASSWORD_MISMATCH", "Passwords did not match. Matching passwords are required.");
			}
		}*/
	}

}
