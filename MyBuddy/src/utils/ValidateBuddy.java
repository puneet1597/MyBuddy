package utils;

import java.util.HashMap;

import com.app.core.Buddy;

public class ValidateBuddy {

	public static void emailValidation(String em, HashMap<String, Buddy> hm) throws ExceptionHandling {
		if (em.contains("@") && em.endsWith(".com")) {
			for (String val : hm.keySet()) {
				if (val.contains(em)) {
					throw new ExceptionHandling("Email already exists");
				}
			}
		} else {
			throw new ExceptionHandling("Enter valid Email");
		}
	}

	public static void phoneNumberValidation(String ph, HashMap<String, Buddy> hm) throws ExceptionHandling {
		if (ph.matches("^\\d{10}$")) {

			for (Buddy val : hm.values()) {
				if (val.getPhoneNo().equals(ph)) {
					throw new ExceptionHandling("Number already exists");
				}
			}

		} else {
			throw new ExceptionHandling("Enter valid Phone Number");
		}
	}
}
