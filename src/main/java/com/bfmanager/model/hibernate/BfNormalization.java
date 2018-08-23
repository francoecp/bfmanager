package com.bfmanager.model.hibernate;
// Generated 16/10/2017 02:04:00 AM by Hibernate Tools 5.2.3.Final

/**
 * BfNormalization generated by hbm2java
 */
public class BfNormalization implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idBfNormalization;
	private int maximum;
	private int minimum;
	private Integer idSurvey;

	public BfNormalization() {
	}

	public BfNormalization(int maximum, int minimum) {
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public BfNormalization(int maximum, int minimum, Integer idSurvey) {
		this.maximum = maximum;
		this.minimum = minimum;
		this.idSurvey = idSurvey;
	}

	public Integer getIdBfNormalization() {
		return this.idBfNormalization;
	}

	public void setIdBfNormalization(Integer idBfNormalization) {
		this.idBfNormalization = idBfNormalization;
	}

	public int getMaximum() {
		return this.maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public int getMinimum() {
		return this.minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public Integer getIdSurvey() {
		return this.idSurvey;
	}

	public void setIdSurvey(Integer idSurvey) {
		this.idSurvey = idSurvey;
	}

}
