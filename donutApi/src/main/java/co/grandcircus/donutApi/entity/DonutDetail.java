package co.grandcircus.donutApi.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DonutDetail {
	
	String name;
	Integer calories;
	List<String> extras;
	
	@JsonProperty("photo")
	String image;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public List<String> getExtras() {
		return extras;
	}

	public void setExtras(List<String> extras) {
		this.extras = extras;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "DonutDetail [name=" + name + ", calories=" + calories + ", image=" + image + "]";
	}
	
	

}
