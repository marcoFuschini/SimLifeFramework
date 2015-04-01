package it.SimLife.SingleThreadedVersion.Model.Ambienti;

import it.SimLife.SingleThreadedVersion.Interfaces.IAmbienteST;
import it.SimLife.SingleThreadedVersion.Interfaces.IOrganismoST;

public class ambienteMK1 implements IAmbienteST {
	
	

	@Override
	public boolean TICK() {
		return false;
	}

	@Override
	public void add(IOrganismoST organismo, float X, float Y) {
	}

	@Override
	public void remove(IOrganismoST org) {
	}

	@Override
	public IOrganismoST[] getOrganismi() {
		return null;
	}

	@Override
	public IOrganismoST getOrganismoAt(float X, float Y) {
		return null;
	}

	@Override
	public boolean setX(IOrganismoST org, float X) {
		return false;
	}

	@Override
	public boolean setY(IOrganismoST org, float Y) {
		return false;
	}

	@Override
	public float getX(IOrganismoST org) {
		return 0;
	}

	@Override
	public float getY(IOrganismoST org) {
		return 0;
	}

	@Override
	public boolean setProperty(String proprieta, String valore) {
		return false;
	}

	@Override
	public String getProperty(String proprieta) {
		return null;
	}

}
