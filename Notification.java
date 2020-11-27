package advancedSoftware;
import java.util.ArrayList;

public class Notification {
	public ArrayList<ArrayList<notificationsType>> allNotifications =  new ArrayList<ArrayList<notificationsType>>();
	public ArrayList<notificationsType> Activation = new ArrayList<notificationsType>();
	public ArrayList<notificationsType> Booking = new ArrayList<notificationsType>();
	public ArrayList<notificationsType> Forget = new ArrayList<notificationsType>();
	public ArrayList<notificationsType> sms = new ArrayList<notificationsType>();
	private String  deletedNotification;
	
	Notification()
	{
		deletedNotification = "";
	}
    public void readNotification(ArrayList<notificationsType>notifications)
    {

    	int arrayListLength =notifications.size() ;
    	for(int i = 0; i < arrayListLength; i++)
    	{
    		System.out.println(notifications.get(i).subject);
			System.out.println(notifications.get(i).message);
    	}
    }
    
    public void readAllNotification(ArrayList<ArrayList<notificationsType>> allNotifications)
    {
    	int arrayListLength = allNotifications.size();
    	 for (int i = 0; i < arrayListLength; i++) { 
             for (int j = 0; j < allNotifications.get(i).size(); j++) {
				 System.out.println(allNotifications.get(i).get(j).subject);
				 System.out.println(allNotifications.get(i).get(j).message);
             } 
         } 
    }

    public void updateNotification(int index, ArrayList<notificationsType>notifications, String subject,String message)
    {
		notificationsType updatedNotification = notifications.get(index), newNotification =  new notificationsType() ;
		newNotification.setMessage(message);
		newNotification.setSubject(subject);
    	if(!sms.equals(notifications))
    	{
    		int arrayListLength = sms.size();
    		for(int i = 0; i < arrayListLength; i++)
    		{
    			if(updatedNotification.equals(sms.get(i)))
    			{
    				sms.set(i, newNotification);
    				break;
    			}
    					
    		}
    	}
        notifications.set(index, newNotification);
    }
	public void updateAllNotification(int index,  ArrayList<ArrayList<notificationsType>> allNotifications, String subject,String message)
	{
		notificationsType  newNotification =  new notificationsType() ;
		newNotification.setMessage(message);
		newNotification.setSubject(subject);
		int temp=0;
		for (int i = 0; i <allNotifications.size() ; i++) {
			for (int j = 0; j < allNotifications.get(i).size(); j++) {

				if(temp==index)
				{
					notificationsType object=allNotifications.get(i).get(j);

					allNotifications.get(i).set(j,newNotification);

					for (int k = 0; k < sms.size(); k++) {

						if(sms.get(k).equals(object))
						{
							sms.set(k,newNotification);
						}
					}

				}
				temp++;

			}
		}

	}

    public void deleteNotification(int index, ArrayList<notificationsType>notifications)
    {
		notificationsType	deletedNotification = notifications.get(index);
    	if(!sms.equals(notifications))
    	{
    		int arrayListLength = sms.size();
    		for(int i = 0; i < arrayListLength; i++)
    		{
    			if(deletedNotification.equals(sms.get(i)))
    			{
    				sms.remove(i);
    				break;
    			}
    					
    		}
    	}
    	notifications.remove(index);
    }

	public void deleteAllNotification(int index, ArrayList<ArrayList<notificationsType>> allNotifications )
	{
		int temp=0;
		for (int i = 0; i <allNotifications.size() ; i++) {
			for (int j = 0; j < allNotifications.get(i).size(); j++) {

				if(temp==index)
				{
					notificationsType object=allNotifications.get(i).get(j);

					allNotifications.get(i).remove(j);

					for (int k = 0; k < sms.size(); k++) {

						if(sms.get(k).equals(object))
						{
							sms.remove(k);
						}
					}

				}
				temp++;

			}
		}
	}

    public void createNotification(String passedName, String passedEmail, String passedPhone, String passedItem, String passedRequestType, String passedLanguage)
    {


		notificationsType obj= new notificationsType();
		obj.notificationContents(passedLanguage, passedRequestType, passedName, passedItem, passedEmail);

    	if (passedRequestType.equalsIgnoreCase("Activation"))
		{
			Activation.add(obj);
		}

    	else if(passedRequestType.equalsIgnoreCase("Booking"))
		{
			Booking.add(obj);
		}
    	else if(passedRequestType.equalsIgnoreCase("Forget"))
    		Forget.add(obj);
    	if(passedPhone != "")
    		sms.add(obj);


    }
}
