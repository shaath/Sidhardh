package methods;

public class TestSuite {

	public static void main(String[] args)
	{
		// LoginTC
		OrgHRMLibrary om=new OrgHRMLibrary();
		
		String res=om.OrgLaunch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.OrgLogin("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.OrgLogout();
		System.out.println("Application Logout "+res);
		
		om.OrgClose();
		System.out.println("Browser Closed Successfully");
		
		//EmpRegTC
		
		res=om.OrgLaunch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.OrgLogin("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.OrgEmpReg("Vignan", "Kumar","E321");
		System.out.println("Employee Registration "+res);
		
		res=om.OrgLogout();
		System.out.println("Application Logout "+res);
		
		om.OrgClose();
		System.out.println("Browser Closed Successfully");
		
		//UserReg
		
		res=om.OrgLaunch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.OrgLogin("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.OrgUserReg("Vignan Kumar", "VignanKumar123456", "VignanKumar123456", "VignanKumar123456");
		System.out.println("User registration "+res);
		
		res=om.OrgLogout();
		System.out.println("Application Logout "+res);
		
		om.OrgClose();
		System.out.println("Browser Closed Successfully");

		//UserLogin
		
		res=om.OrgLaunch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.OrgLogin("VignanKumar123456", "VignanKumar123456");
		System.out.println("Application Login "+res);
		
		res=om.OrgLogout();
		System.out.println("Application Logout "+res);
		
		om.OrgClose();
		System.out.println("Browser Closed Successfully");


	}

}
