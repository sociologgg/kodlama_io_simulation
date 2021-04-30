package kodlamaio_simulation;

public class Instructor extends User {
	String profession;

	public Instructor(int id ,String name, String userType, String profession, String location) {
		this.id = id;
		this.name = name;
		this.userType = userType;
		this.profession = profession;
		this.location = location;
		
		
	}
	
	
	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
}
