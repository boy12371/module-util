package io.swagger.util.common1.bean;

public class Auditing extends BaseAuditing {
	private static final long serialVersionUID = 1L;

	/* [CONSTRUCTOR MARKER BEGIN] */
	public Auditing() {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Auditing(java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Auditing(java.lang.Integer id, Status result, User auditor, Vediotape vedioID, java.util.Date auditDate) {

		super(id, result, auditor, vedioID, auditDate);
	}

	/* [CONSTRUCTOR MARKER END] */

}