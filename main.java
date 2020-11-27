package advancedSoftware;

public class main {
	public static void main(String[] args) {
		userData objec= new userData();
		objec.getInformation();

	   // objec.obj.updateNotification(0, objec.obj.Activation, "Hello","hshsh");
	   // objec.obj.readNotification(objec.obj.sms);
		//objec.obj.deleteNotification(0);
		objec.obj.readAllNotification(objec.obj.allNotifications);
		System.out.println("***********");
//objec.obj.updateAllNotification(0,objec.obj.allNotifications,"sub","message");
		objec.obj.readNotification(objec.obj.Activation);
	}
}
