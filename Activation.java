package advancedSoftware;

public class Activation {
	
	    public String name, email, fullNotify, completedNotification, message;
	    
	    public Activation()
	    {
	    	name = "";
	    	email = "";
	    	fullNotify = "";
	    	completedNotification ="";
	    	message = "";
	    }
	    
	    public String setUser(String passedName, String passedEmail)
	    {
	       name = passedName;
	       email = passedEmail;
	       String completedNotification = createNotification();
	       return completedNotification;
	     }
	    
	     public String notificationSubject()
	     {
	         return "Activation Request";
	     }
	     
	     public String notificationContent()
	     {
	    	message = "Dear " + name + " your Email: " + email + " need to be activated click link below to activate your email" + "\n" + "www.linkExample.com";
	        return message;
	     }
	     
	     public String createNotification()
	     {
	        String fullNotify = notificationSubject() + "\n" + notificationContent();
	        return fullNotify;
	     }

}
