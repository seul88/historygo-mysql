package com.historygo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String email;

    private String country;

    private int points;

	@ManyToMany
    private List<Places> places = new ArrayList<Places>();



	public void addPlace(Places place){
		this.places.add(place);
		place.getUsers().add(this);
	}

	public void removePlace(Places place){
		this.places.remove(place);
		place.getUsers().remove(place);
	}


	public List<Places> getPlaces() {
		return places;
	}

	public void setPlaces(List<Places> places) {
		this.places = places;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
}

