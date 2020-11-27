package advancedSoftware;
import java.util.ArrayList;

public class Notification {
	
	ArrayList<String> notifications = new ArrayList<String>();	
    public void readNotification()
    {
    	for(int i = 0; i < notifications.size(); i++)
    	{
    		System.out.println(notifications.get(i));
    	}
    }

    public void updateNotification(int index, String newNotification)
    {
        notifications.set(index, newNotification);
    }

    public void deleteNotification(int index)
    {
        notifications.remove(index);
    }
}
