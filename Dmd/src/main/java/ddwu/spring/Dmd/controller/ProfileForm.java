package ddwu.spring.Dmd.controller;

import java.io.Serializable;

import ddwu.spring.Dmd.domain.Profile;

@SuppressWarnings("serial")
public class ProfileForm implements Serializable {
	
	private Profile profile;
	private boolean newProfile;
	private String repeatedPassword;
	
	public ProfileForm() {
		this.profile = new Profile();
		this.newProfile = true;
	}
	
	public ProfileForm(Profile profile) {
		this.profile = profile;
		this.newProfile = false;
	}
	
	public Profile getProfile() {
		return profile;
	}
	
	public boolean isNewProfile() {
		return newProfile;
	}

	public void setRepeatedPassword(String repeatedPassword) {
		this.repeatedPassword = repeatedPassword;
	}

	public String getRepeatedPassword() {
		return repeatedPassword;
	}
}
