import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
 //look up videos on json
public class JsonEx {
	
	public static void main(String[] args) {
		
		JSONObject emp1 = new JSONObject();
		emp1.put("Name", "Tilaka");
		emp1.put("Department", "Training");
		emp1.put("Mobile", "9790760822");
		emp1.put("Name", "Yashu");
		
		JSONObject emp2 = new JSONObject();
		emp2.put("Name", "Sandy");
		emp2.put("Department", "Sales");
		emp2.put("Mobile", "9884171788");
		
		JSONArray empInfo = new JSONArray();
		empInfo.add(emp1);
		empInfo.add(emp2);
		
		try
		{
		FileWriter fout = new FileWriter("employee.json");
		fout.write(empInfo.toJSONString());
		fout.flush();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
	}
}			
 
has context menu
Compose


// import java.io.FileReader;
// import java.text.ParseException;
 
// import org.json.simple.JSONArray;
// import org.json.simple.JSONObject;
// import org.json.simple.parser.JSONParser;
 
// public class ReadJson {
 
// 	public static void main(String[] args) {
// 		JSONParser jsonParse = new JSONParser();
// 		try
// 		{
// 			FileReader reader = new FileReader("employee.json");
// 			Object obj = jsonParse.parse(reader);
// 			JSONArray empInfo = (JSONArray) obj;
// 			System.out.println(empInfo);
			
// 			empInfo.forEach(emp-> parseEmp((JSONObject) emp));
// 		}
// 		catch(Exception  e)
// 		{
// 			System.out.println(e);
// 		}
// 		//parseEmp(null);
// 	}
	
// 	static void parseEmp(JSONObject employee)
// 	{
// 		String empName = (String)employee.get("Name");
// 		System.out.println(empName);
// 	}
// }
 