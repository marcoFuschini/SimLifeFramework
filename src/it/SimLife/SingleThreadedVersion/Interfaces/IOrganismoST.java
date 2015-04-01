package it.SimLife.SingleThreadedVersion.Interfaces;

public interface IOrganismoST {

	public void TICK();
	
	public boolean setProperty(String proprieta,String valore);
	public String getProperty(String proprieta);
	
	public void intersectionWith(IOrganismoST org);
}
