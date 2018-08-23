package com.bfmanager.model.hibernate;
// Generated 2/08/2017 11:42:12 PM by Hibernate Tools 5.2.3.Final

/**
 * MultipleChoice generated by hbm2java
 */
public class MultipleChoice implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idMultipleChoice;
	private String description;
	private Long question;

	public MultipleChoice() {
	}

	public MultipleChoice(String description, Long question) {
		this.description = description;
		this.question = question;
	}

	public Long getIdMultipleChoice() {
		return this.idMultipleChoice;
	}

	public void setIdMultipleChoice(Long idMultipleChoice) {
		this.idMultipleChoice = idMultipleChoice;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getQuestion() {
		return this.question;
	}

	public void setQuestion(Long question) {
		this.question = question;
	}

}
