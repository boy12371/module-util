package io.swagger.util.common1.bean;

public class Playorder extends BasePlayorder {
	private static final long serialVersionUID = 1L;

	/* [CONSTRUCTOR MARKER BEGIN] */
	public Playorder() {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Playorder(java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Playorder(java.lang.Integer id, User auditor, Vediotape vedioID, java.util.Date playDate,
			java.util.Date arrangeDate, java.lang.Integer status) {

		super(id, auditor, vedioID, playDate, arrangeDate, status);
	}

	/* [CONSTRUCTOR MARKER END] */

}