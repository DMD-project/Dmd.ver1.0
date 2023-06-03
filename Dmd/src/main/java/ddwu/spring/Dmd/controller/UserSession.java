package ddwu.spring.Dmd.controller;

import java.io.Serializable;

import ddwu.spring.Dmd.domain.Profile;

@SuppressWarnings("serial")
public class UserSession implements Serializable {
	
	private Profile profile;
	
	public UserSession(Profile profile) {
		this.profile = profile;
	}

	public Profile getProfile() {
		return profile;
	}
}
