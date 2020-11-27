package advancedSoftware;
import java.io.*;  

public class userData {
	
	private String name, email, phone, Item, requestType, language;
    public Notification obj = new Notification();
	userData()
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

        			obj.createNotification(name, email, phone, Item, requestType, language);
        		}
    			line = reader.readLine();
    		}  
    		reader.close();
    		obj.allNotifications.add(obj.Activation);
			obj.allNotifications.add(obj.Booking);
			obj.allNotifications.add(obj.Forget);
    	}
    	catch(IOException e)  
    	{  
    		System.out.println("there's problem with database");  
    	}  
    }
}