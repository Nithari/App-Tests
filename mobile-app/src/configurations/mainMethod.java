package configurations;

import java.net.MalformedURLException;

public class mainMethod {

	public static void main(String[] args) 
	{
		appiumConfiguration con = new appiumConfiguration();
		try 
		{
			con.settings();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
