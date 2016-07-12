package prob4;

public class SmartPhone extends MusicPhone {

	public void execute(String function) {

		if (function.equals("앱")) {
			System.out.println("앱실행");
		} else {
			new MusicPhone().execute(function);
		}

	}
}
