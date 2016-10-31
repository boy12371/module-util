package io.swagger.util.common1.bean;

public class Audiencescore extends BaseAudiencescore {
	private static final long serialVersionUID = 1L;

	/* [CONSTRUCTOR MARKER BEGIN] */
	public Audiencescore() {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Audiencescore(java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Audiencescore(java.lang.Integer id, Audience audienceID, Vediotape vedioID, java.util.Date dateExamine,
			java.lang.Integer result) {

		super(id, audienceID, vedioID, dateExamine, result);
	}

	/* [CONSTRUCTOR MARKER END] */

}