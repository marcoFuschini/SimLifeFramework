package it.SimLife.MultiThreadedVersion.Interfaces;

import it.SimLife.MultiThreadedVersion.Exceptions.InvalidQueryException;

public interface IOrganismoMT extends Runnable{

	public Object Query(String query) throws InvalidQueryException;//a seconda della query, può ritornare oggetti diversi, se la query non funziona, lancia un eccezione
	
}
