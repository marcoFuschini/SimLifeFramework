package it.SimLife.SingleThreadedVersion.Model.Organismi;

import it.SimLife.SingleThreadedVersion.Interfaces.IOrganismoST;

public class orgBasic1 implements IOrganismoST {

	@Override
	public void TICK() {
	}

	@Override
	public boolean setProperty(String proprieta, String valore) {
		return false;
	}

	@Override
	public String getProperty(String proprieta) {
		return null;
	}

	@Override
	public void intersectionWith(IOrganismoST org) {
	}

}
