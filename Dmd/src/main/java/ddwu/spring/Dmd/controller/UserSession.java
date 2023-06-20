package ddwu.spring.Dmd.controller;

import java.io.Serializable;
import org.springframework.beans.support.PagedListHolder;

import ddwu.spring.Dmd.domain.Product;
import ddwu.spring.Dmd.domain.Profile;

@SuppressWarnings("serial")
public class UserSession implements Serializable {
	
	private Profile profile;
	private PagedListHolder<Product> myList;

	
	public UserSession(Profile profile) {
		this.profile = profile;
	}

	public Profile getProfile() {
		return profile;
	}
	public void setMyList(PagedListHolder<Product> myList) {
		this.myList = myList;
	}

	public PagedListHolder<Product> getMyList() {
		return myList;
	}
	@Override
	public String toString() {
		return "UserSession [account=" + profile + ", myList=" + myList + "]";
	}
}
