package io.swagger.util.common1.bean;

public class User extends BaseUser {
	private static final long serialVersionUID = 1L;

	/* [CONSTRUCTOR MARKER BEGIN] */
	public User () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public User (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public User (
		java.lang.Integer id,
		Employee employee,
		java.lang.String userName,
		java.lang.String userPass,
		java.lang.Integer status) {

		super (
			id,
			employee,
			userName,
			userPass,
			status);
	}
	
//	public List<String> getGrantedResource() {
//		// TODO Auto-generated method stub
//		Iterator<Role> it = this.getRoles().iterator();
//		List<String> grantedResource = new ArrayList<String>();  
//		while (it.hasNext()) {
//			Role role = it.next();
//			Iterator<Resources> rIt  = role.getResources().iterator();
//			while (rIt.hasNext()) {
//				Resources r = rIt.next();
//				if(!grantedResource.contains(r.getUrl())){
//					grantedResource.add(r.getUrl());
//				}
//				
//			}
//		}
//        return grantedResource;
//	}

	/* [CONSTRUCTOR MARKER END] */

}