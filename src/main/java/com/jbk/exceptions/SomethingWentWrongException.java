package com.jbk.exceptions;

public class SomethingWentWrongException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SomethingWentWrongException(String msg) 
	{
		super(msg);
	}
}
