package com.bfmanager.model.hibernate;
// Generated 16/10/2017 02:04:00 AM by Hibernate Tools 5.2.3.Final

/**
 * BfDimensions generated by hbm2java
 */
public class BfDimensions implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idBfDimension;
	private String name;
	private String abbreviation;
	private String description;
	private int baseValue;
	private int divide;
	private Integer idSurvey;

	public BfDimensions() {
	}

	public BfDimensions(String name, String abbreviation, String description, int baseValue, int divide) {
		this.name = name;
		this.abbreviation = abbreviation;
		this.description = description;
		this.baseValue = baseValue;
		this.divide = divide;
	}

	public BfDimensions(String name, String abbreviation, String description, int baseValue, int divide,
			Integer idSurvey) {
		this.name = name;
		this.abbreviation = abbreviation;
		this.description = description;
		this.baseValue = baseValue;
		this.divide = divide;
		this.idSurvey = idSurvey;
	}

	public Integer getIdBfDimension() {
		return this.idBfDimension;
	}

	public void setIdBfDimension(Integer idBfDimension) {
		this.idBfDimension = idBfDimension;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbreviation() {
		return this.abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getBaseValue() {
		return this.baseValue;
	}

	public void setBaseValue(int baseValue) {
		this.baseValue = baseValue;
	}

	public int getDivide() {
		return this.divide;
	}

	public void setDivide(int divide) {
		this.divide = divide;
	}

	public Integer getIdSurvey() {
		return this.idSurvey;
	}

	public void setIdSurvey(Integer idSurvey) {
		this.idSurvey = idSurvey;
	}

}
