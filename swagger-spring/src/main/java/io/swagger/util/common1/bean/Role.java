package io.swagger.util.common1.bean;

public class Role extends BaseRole {
	
	private static final long serialVersionUID = 1L;

	/*[CONSTRUCTOR MARKER BEGIN]*/
		public Role () {
			super();
		}

		/**
		 * Constructor for primary key
		 */
		public Role (java.lang.Integer id) {
			super(id);
		}

		/**
		 * Constructor for required fields
		 */
		public Role (
			java.lang.Integer id,
			java.lang.String name) {

			super (
				id,
				name);
		}

	/*[CONSTRUCTOR MARKER END]*/
}