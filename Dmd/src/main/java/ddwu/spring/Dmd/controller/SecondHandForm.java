package ddwu.spring.Dmd.controller;

import java.io.Serializable;

import ddwu.spring.Dmd.domain.SecondHand;

@SuppressWarnings("serial")
public class SecondHandForm implements Serializable {
	
	private SecondHand secondHand;
	
	public SecondHandForm() {
		this.secondHand = new SecondHand();
	}

	public SecondHand getSecondHand() {
		return secondHand;
	}
}
