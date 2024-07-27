package br.com.fuctura.database;

public class DBException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DBException(String message) {
		super(message);
	}

}
