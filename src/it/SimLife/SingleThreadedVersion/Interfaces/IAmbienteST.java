package it.SimLife.SingleThreadedVersion.Interfaces;

import java.util.Collection;

public interface IAmbienteST {
	
	//TODO guardarsi libreria G http://geosoft.no/graphics/ per grafica 2D
	
	public boolean TICK();

	public void add(IOrganismoST organismo,float X, float Y);
//	public void add(Collection<IOrganismoST> organismoArr);
	
	public void remove(IOrganismoST org);
	
	public IOrganismoST[] getOrganismi();
	public IOrganismoST getOrganismoAt(float X,float Y);
	
//	public boolean setPosition(IOrganismoST org,float X, float Y);
	public boolean setX(IOrganismoST org, float X);
	public boolean setY(IOrganismoST org, float Y);
	public float getX(IOrganismoST org);
	public float getY(IOrganismoST org);
	
	public boolean setProperty(String proprieta,String valore);
	public String getProperty(String proprieta);
}
