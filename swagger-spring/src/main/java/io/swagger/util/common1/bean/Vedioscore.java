package io.swagger.util.common1.bean;

public class Vedioscore extends BaseVedioscore {
	private static final long serialVersionUID = 1L;

	/* [CONSTRUCTOR MARKER BEGIN] */
	public Vedioscore() {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Vedioscore(java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Vedioscore(java.lang.Integer id, Vediotape vedio, User examiner, User operator, java.lang.Float storyScore,
			java.lang.Float techScore, java.lang.Float performScore, java.lang.Float innovateScore,
			java.lang.Float score, java.lang.Integer award, java.lang.Integer orientation, java.lang.Integer purchase,
			java.util.Date dateExamine) {

		super(id, vedio, examiner, operator, storyScore, techScore, performScore, innovateScore, score, award,
				orientation, purchase, dateExamine);
	}

	/* [CONSTRUCTOR MARKER END] */
}