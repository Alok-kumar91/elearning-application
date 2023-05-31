package in.alokit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Address {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String city;
private String street;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public Address(Integer id, String city, String street) {
	super();
	this.id = id;
	this.city = city;
	this.street = street;
}
public Address() {
	super();
}
@Override
public String toString() {
	return "Address [id=" + id + ", city=" + city + ", street=" + street + "]";
}

}
