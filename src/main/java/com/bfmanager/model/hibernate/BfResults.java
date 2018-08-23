package com.bfmanager.model.hibernate;
// Generated 18/10/2017 10:25:02 PM by Hibernate Tools 5.2.3.Final

/**
 * BfResults generated by hbm2java
 */
public class BfResults implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idBfResult;
	private double result;
	private long idBfDimension;
	private Integer idUser;
	private Integer idSurvey;
	private Integer idGroup;

	public BfResults() {
	}

	public BfResults(double result, long idBfDimension) {
		this.result = result;
		this.idBfDimension = idBfDimension;
	}

	public BfResults(double result, long idBfDimension, Integer idUser, Integer idSurvey, Integer idGroup) {
		this.result = result;
		this.idBfDimension = idBfDimension;
		this.idUser = idUser;
		this.idSurvey = idSurvey;
		this.idGroup = idGroup;
	}

	public Integer getIdBfResult() {
		return this.idBfResult;
	}

	public void setIdBfResult(Integer idBfResult) {
		this.idBfResult = idBfResult;
	}

	public double getResult() {
		return this.result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public long getIdBfDimension() {
		return this.idBfDimension;
	}

	public void setIdBfDimension(long idBfDimension) {
		this.idBfDimension = idBfDimension;
	}

	public Integer getIdUser() {
		return this.idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public Integer getIdSurvey() {
		return this.idSurvey;
	}

	public void setIdSurvey(Integer idSurvey) {
		this.idSurvey = idSurvey;
	}

	public Integer getIdGroup() {
		return this.idGroup;
	}

	public void setIdGroup(Integer idGroup) {
		this.idGroup = idGroup;
	}

}