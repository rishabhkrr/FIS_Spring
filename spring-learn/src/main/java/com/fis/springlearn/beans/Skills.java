package com.fis.springlearn.beans;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Skills {

	private static final Logger LOGGER = LoggerFactory.getLogger(Skills.class);

	int id;
	String name;
	public Skills() {
		LOGGER.debug("Inside Skill Constructor");
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
	@Override
	public String toString() {
		return "Skills [id=" + id + ", name=" + name + "]";
	}
	
}
