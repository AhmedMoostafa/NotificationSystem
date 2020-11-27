package advancedSoftware;

public class Forget {

	 public String name;
	    
	    public String setUser(String passedName)
	    {
	       name = passedName;
	       String completedNotification = createNotification();
	       return completedNotification;
	     }
	    
	     public String notificationSubject()
	     {
	         return "Forgot password Request";
	     }
	     
	     public String notificationContent()
	     {
	    	String message = "Hi " + name + " We received a request to reset your password." + "\n" + "Enter following password reset code:" + "\n" + "364471";
	        return message;
	     }
	     
	     public String createNotification()
	     {
	        String fullNotify = notificationSubject() + "\n" + notificationContent();
	        return fullNotify;
	     }

}
