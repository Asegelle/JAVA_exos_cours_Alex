package fr.ibformation.poo.villes.exos.bo;

public class Monument {

	// d�claration des variables
	private String name;
	private int buildYear;

	
	// constructors
public Monument (String name, int buildYear) {
	this.name = name;
	this.buildYear = buildYear;
}
	
	// m�thodes
	
	




@Override
public String toString() {
	return "Monument [name=" + name + ", buildYear=" + buildYear + "]";
}	
	
	// -------------------- getters / setters -------------------------------
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getBuildYear() {
		return buildYear;
	}
	public void setBuildYear(int buildYear) {
		this.buildYear = buildYear;
	}
	
	
	
	
}
