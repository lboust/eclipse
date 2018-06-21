package jsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "person")
@ManagedBean(name="Person", eager = true)
@SessionScoped
public class Person {
	//instance fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="age")
	private int age;
	

	//methods
	public void add() {
		System.out.println(firstname);
		ServicePerson service = new ServicePerson();
		service.addPerson(this);	
	}
	
	public Person() {

	}
	public Person(String firstname, String lastname, int age) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	
	public List<Person> list() {
		ServicePerson service = new ServicePerson();
		List<Person> people = new ArrayList<Person>();
		people = service.findAllPeople();
		/*	
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Lo", "Boust", 23));*/
		return people;
		
	}
	
	//accessors
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
