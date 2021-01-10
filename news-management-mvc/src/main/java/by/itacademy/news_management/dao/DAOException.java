package by.itacademy.news_management.dao;

import java.io.Serializable;

public class DAOException extends Exception implements Serializable {
	private static final long serialVersionUID = -8190989050724632668L;

	public DAOException() {
		super();
	}

	public DAOException(String message) {
		super(message);
	}

	public DAOException(Exception e) {
		super(e);
	}

	public DAOException(String message, Exception e) {
		super(message, e);
	}
}
