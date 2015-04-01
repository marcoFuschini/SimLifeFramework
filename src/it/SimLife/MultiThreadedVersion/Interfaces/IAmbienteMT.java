package it.SimLife.MultiThreadedVersion.Interfaces;

import it.SimLife.MultiThreadedVersion.Exceptions.InvalidQueryException;

public interface IAmbienteMT {

	public Object Query(String query) throws InvalidQueryException;//a seconda della query, pu� ritornare oggetti diversi, se la query non funziona, lancia un eccezione
	public void startSimulazione();
	
}
