package advancedSoftware;
import java.io.*;  
import java.util.ArrayList;

public class User {
	
	public String name, email, phone, Item, requestType, language;
    public Notification obj0 = new Notification();
    public Activation obj1 = new Activation();
    public Forget obj2 = new Forget();
    public Booking obj3 = new Booking();

	public ArrayList<String> notifications = new ArrayList<String>();
 
    User()
    {
    	name = "";
    	email = "";
    	phone = "";
    	Item = "";
    	requestType = "";
    	Item = "";
    	language = "";
    }
 
    public void getInformation()
    {
    	BufferedReader reader; 
    	try  
    	{  
    		reader = new BufferedReader(new FileReader("Database.txt"));
    		String line = reader.readLine();
    		while(line != null)  
    		{  
    			if(line.contains("name"))
        		{
    				line = reader.readLine();
        			name = line;
        		} 
    			else if(line.contains("email"))
        		{
        			line = reader.readLine();
        			email = line;
        			
        		} 
    			else if(line.contains("phone"))
        		{
    				line = reader.readLine();
        			phone = line;
        		} 
    			else if(line.contains("item"))
        		{
    				line = reader.readLine();
        			Item = line;
        		} 
    			else if(line.contains("requestType"))
        		{
    				line = reader.readLine();
        			requestType = line;
        		} 
    			else if(line.contains("language"))
        		{
    				line = reader.readLine();
        			language = line;
        			setNotification();
        		}
    			line = reader.readLine();
    		}  
    		reader.close();     
    		obj0.notifications = notifications;
    	}  
    	catch(IOException e)  
    	{  
    		System.out.println("there's problem with database");  
    	}  
    }
    public void setNotification()
    {
    	if(requestType.equals("Activation"))
    		notifications.add(obj1.setUser(name, email));
    	else if(requestType.equals("Forget"))
    		notifications.add(obj2.setUser(name));
    	else if(requestType.equals("Booking"))
    		notifications.add(obj3.setUser(name, Item));	
    }
    
}