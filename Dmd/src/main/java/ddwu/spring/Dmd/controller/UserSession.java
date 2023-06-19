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
//	public void setMyList(PagedListHolder<Product> myList) {
//		this.myList = myList;
//	}
//
//	public PagedListHolder<Product> getMyList() {
//		return myList;
//	}
//	@Override
//	public String toString() {
//		return "UserSession [account=" + profile + ", myList=" + myList + "]";
//	}
}
