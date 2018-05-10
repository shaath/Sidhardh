package methods;

public class UserRegTC {

	public static void main(String[] args)
	{
		OrgHRMLibrary om=new OrgHRMLibrary();
		
		String res=om.OrgLaunch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.OrgLogin("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.OrgUserReg("Sharath Chandra", "SharathChandra123456", "SharathChandra123456", "SharathChandra123456");
		System.out.println("User registration "+res);
		
		res=om.OrgLogout();
		System.out.println("Application Logout "+res);
		
		om.OrgClose();
		System.out.println("Browser Closed Successfully");

	}

}
