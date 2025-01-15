package ioprogs;

import java.io.FileReader;
import java.text.ParseException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
 
public class ReadJson{
 
	public static void main(String[] args) {
		JSONParser jsonParse = new JSONParser();
		try
		{
			FileReader reader = new FileReader("employee.json");
			Object obj = jsonParse.parse(reader);
			JSONArray empInfo = (JSONArray) obj;
			System.out.println(empInfo);
			
			empInfo.forEach(emp-> parseEmp((JSONObject) emp));
		}
		catch(Exception  e)
		{
			System.out.println(e);
		}
		//parseEmp(null);
	}
	
	static void parseEmp(JSONObject employee)
	{
		String empName = (String)employee.get("Name");
		System.out.println(empName);
	}
}
 