package methods;

public class EmployeeRegTC {

	public static void main(String[] args) 
	{
		OrgHRMLibrary om=new OrgHRMLibrary();
		
		String res=om.OrgLaunch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.OrgLogin("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.OrgEmpReg("Sharath", "Chandra","E123");
		System.out.println("Employee Registration "+res);
		
		res=om.OrgLogout();
		System.out.println("Application Logout "+res);
		
		om.OrgClose();
		System.out.println("Browser Closed Successfully");

	}

}
