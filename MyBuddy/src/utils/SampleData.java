package utils;

import static java.time.LocalDate.parse;

import java.util.HashMap;

import com.app.core.Buddy;

public class SampleData {

	public static HashMap<String, Buddy> populateData() {
		
		HashMap<String, Buddy> bd = new HashMap<>();
		
		bd.put("puneetsinghal1597@gmail.com", new Buddy("puneetsinghal1597@gmail.com", "Puneet", "7014064824", parse("1997-06-15"), "Ajmer"));
		bd.put("buddy1@gmail.com", new Buddy("buddy1@gmail.com", "Buddy1", "7792042917", parse("1991-05-19"), "Jaipur"));
		bd.put("buddy2@gmail.com", new Buddy("buddy2@gmail.com", "Buddy2", "9352652866", parse("2000-01-17"), "Delhi"));
		bd.put("buddy3@gmail.com", new Buddy("buddy3@gmail.com", "Buddy3", "9545693213", parse("1989-11-28"), "Pune"));
		
		return bd;
	}
}
