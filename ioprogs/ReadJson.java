package ioprogs;

import java.io.FileReader;
import java.text.ParseException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
 
public class ReadJson{
 
	@SuppressWarnings("unchecked")
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
        //my trial begins
        try{
            FileReader r = new FileReader("library.json");
            Object o = jsonParse.parse(r);
            JSONArray lib = (JSONArray) o;
            System.out.println(lib);

            lib.forEach(book-> printLib((JSONObject) book));
            
            
        }catch(Exception e){
            System.out.println(e);
        }
	}
	
	static void parseEmp(JSONObject employee)
	{
		String empName = (String)employee.get("Name");
		System.out.println(empName);
	}
    static void printLib(JSONObject book){
        String title = (String)book.get("Title");
        String author = (String)book.get("author");
        System.out.println("title = " + title);
        System.out.println("author = " + author);
    }

}
 