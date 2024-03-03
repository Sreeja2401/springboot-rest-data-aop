package com.epam.exceptions;

public class InsufficientQuestionException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InsufficientQuestionException (String message)
    {
        super(message);
    }
}
