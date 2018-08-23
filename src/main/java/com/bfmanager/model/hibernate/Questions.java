package com.bfmanager.model.hibernate;
// Generated 25/11/2017 05:48:40 PM by Hibernate Tools 5.2.3.Final

/**
 * Questions generated by hbm2java
 */
public class Questions implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Long idQuestion;
	private String title;
	private Boolean required;
	private int survey;
	private QuestionsType type;
	private String help;	
	private Boolean showStats = true;
	private Boolean showResults = true;

	public Questions() {
	}

	public Questions(String title, int survey, QuestionsType type) {
		this.title = title;
		this.survey = survey;
		this.type = type;
	}

	public Questions(String title, Boolean required, int survey, QuestionsType type, String help, Boolean showStats,
			Boolean showResults) {
		this.title = title;
		this.required = required;
		this.survey = survey;
		this.type = type;
		this.help = help;
		this.showStats = showStats;
		this.showResults = showResults;
	}

	public Long getIdQuestion() {
		return this.idQuestion;
	}

	public void setIdQuestion(Long idQuestion) {
		this.idQuestion = idQuestion;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean getRequired() {
		return this.required;
	}

	public void setRequired(Boolean required) {
		this.required = required;
	}

	public int getSurvey() {
		return this.survey;
	}

	public void setSurvey(int survey) {
		this.survey = survey;
	}

	public QuestionsType getType() {
		return this.type;
	}

	public void setType(QuestionsType type) {
		this.type = type;
	}

	public String getHelp() {
		return this.help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public Boolean getShowStats() {
		return this.showStats;
	}

	public void setShowStats(Boolean showStats) {
		this.showStats = showStats;
	}

	public Boolean getShowResults() {
		return this.showResults;
	}

	public void setShowResults(Boolean showResults) {
		this.showResults = showResults;
	}

}
