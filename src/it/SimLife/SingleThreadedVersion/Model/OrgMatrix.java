package it.SimLife.SingleThreadedVersion.Model;

import java.util.Iterator;

import it.SimLife.SingleThreadedVersion.Interfaces.IOrganismoST;

public class OrgMatrix {
	private IOrganismoST[] matrix;
	private int maxX,maxY;
	
	public OrgMatrix(int maxX,int maxY){
		matrix=new IOrganismoST[maxX*maxY];
		for(IOrganismoST org:matrix){
			org=null;
		}
		this.maxX=maxX;
		this.maxY=maxY;
	}
	
	private boolean arrayIndexOutOfBoundCheck(int x, int y){
		return ((x>=maxX)||(y>=maxY)||(x<0)||(y<0));
	}
	
	public void addAt(IOrganismoST org,int x, int y){
		if(arrayIndexOutOfBoundCheck(x, y)) throw new ArrayIndexOutOfBoundsException();
		matrix[maxX*y+x]=org;
	}
	
	public void removeAt(int x,int y){
		if(arrayIndexOutOfBoundCheck(x, y)) throw new ArrayIndexOutOfBoundsException();
		matrix[maxX*y+x]=null;
	}
	
	public IOrganismoST getAt(int x,int y){
		if(arrayIndexOutOfBoundCheck(x, y)) throw new ArrayIndexOutOfBoundsException();
		return matrix[maxX*y+x];
	}
	
	public boolean moveFromTo(int fx, int fy, int tx, int ty){
		if(arrayIndexOutOfBoundCheck(fx, fy)) throw new ArrayIndexOutOfBoundsException("FROM coordinates OOB");
		if(arrayIndexOutOfBoundCheck(tx, ty)) throw new ArrayIndexOutOfBoundsException("TO coordinates OOB");
		if(getAt(fx, fy)==null)return false;
		if(getAt(tx, ty)==null)return false;
		addAt(getAt(fx, fy), tx, ty);
		removeAt(fx, fy);
		return true;
	}
	
	public Iterator<IOrganismoST> iterator(){
		return new Iterator<IOrganismoST>() {

			private int length=maxX*maxY;
			private int count=0;
			
			@Override
			public boolean hasNext() {
				if(count<length) return true;
				else return false;
			}

			@Override
			public IOrganismoST next() {
				IOrganismoST org=matrix[count];
				count++;
				return org;
			}
		};
	}
}
