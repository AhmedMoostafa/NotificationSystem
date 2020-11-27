package advancedSoftware;

public class Booking {

	private String name, Item;
    
    public String setUser(String passedName, String passedItem)
    {
       name = passedName;
       Item = passedItem;
       String completedNotification = createNotification();
       return completedNotification;
     }
    
     public String notificationSubject()
     {
         return "Booking Request";
     }
     
     public String notificationContent()
     {
    	String message = "Dear " + name + " You are buying " + Item + "\n" + "Enter below code to complete purchase process: " + "\n" + "364471";
        return message;
     }
     
     public String createNotification()
     {
        String fullNotify = notificationSubject() + "\n" + notificationContent();
        return fullNotify;
     }

}
