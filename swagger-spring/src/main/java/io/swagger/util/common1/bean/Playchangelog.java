package io.swagger.util.common1.bean;

public class Playchangelog extends BasePlaychangelog {
	private static final long serialVersionUID = 1L;

	/* [CONSTRUCTOR MARKER BEGIN] */
	public Playchangelog() {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Playchangelog(java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Playchangelog(java.lang.Integer id, User auditor, Vediotape vedioID, java.util.Date date) {

		super(id, auditor, vedioID, date);
	}

	/* [CONSTRUCTOR MARKER END] */

}