package com.TestRailManager;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import com.gurock.testrail.APIClient;
import com.gurock.testrail.APIException;

public class TestRailManager {
	
	public static String Test_Run_ID = "17";
	
	public static String TestRail_Username = "studymailid12@gmail.com";
	public static String TestRail_Password = "Prajakta@123";
	
	public static String TestRail_URL = "https://testrailjenkins.testrail.io/";
	
	public static int Test_Case_Pass_Status = 1;
	public static int Test_Case_Fail_Status = 5;
	
	public static void AddResult(String TestCaseID, int status, String Error)
	{
		String testID = Test_Run_ID;
		APIClient client = new APIClient(TestRail_URL);
		client.setUser(TestRail_Username);
		client.setPassword(TestRail_Password);
		
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("stauts_id", status);
		data.put("Error", "Error Message"+Error);
		try {
			client.sendPost("add_result_for_case/"+testID+"/"+TestCaseID, data);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (APIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
