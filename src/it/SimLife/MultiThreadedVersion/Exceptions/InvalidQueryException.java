package it.SimLife.MultiThreadedVersion.Exceptions;

public class InvalidQueryException extends Exception {

	String query;
	
	public InvalidQueryException(String query){
		this.query=query;
	}
	
	public String getInvalidQuery(){
		return query;
	}
}
