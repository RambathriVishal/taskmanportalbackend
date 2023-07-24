package com.thecodeveal.app.exception;



public class TaskNotFoundException extends RuntimeException {

	public TaskNotFoundException(Long id) {
		super("Could not found the user with id "+id);
	}
}
