package fr.ibformation.todolist.bo;


public class Course {


	// déclaration des variables
	private int id;
	private String name;
	private int quantity;


	
	
	// constructors
	public Course(int id, String name, int quantity) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		}
	
	public Course(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
		}
	
	public Course() {
		this.id = 0;
		this.name = null;
		this.quantity = 0;
		}


	// methodes

	public String description() {
		String description = this.id +" "+this.name + " " + this.quantity + " ";
		return description;
		
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", quantity=" + quantity + "]";
	}


	
	
	
	
// -------------------------------------- Getters / Setters -----------------------------------------------------	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}





}
