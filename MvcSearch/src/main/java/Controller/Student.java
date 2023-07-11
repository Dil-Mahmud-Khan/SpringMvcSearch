package Controller;

import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {
	private String name;
	private String id;
	@DateTimeFormat(pattern = "dd/MM/yy")
	private String date;
	private String gender;
	private String type;
	private List<String> courses;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", date=" + date + ", gender=" + gender + ", type=" + type
				+ ", courses=" + courses + "]";
	}

	
}
