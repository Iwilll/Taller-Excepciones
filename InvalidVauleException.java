package tallerWilliamM;

public class InvalidVauleException extends Exception {

	private String message;

	public InvalidVauleException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}

}
