package advancedSoftware;
import java.util.Random;
public class notificationsType{
	public String subject, message;
	public long randomCode;

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setMessage(String message) {
		this.message = message;
	}



    notificationsType()
    {
    	subject = "";
    	message = "";
		randomCode=0;
    }
    private long codeGenerator()
	{
		randomCode= (long) (Math.random() * (999999 - 100000 + 1) + 100000);
		return randomCode;
	}
    public void notificationContents(String passedLanguage, String passedRequestType, String passedName, String passedItem, String passedEmail)
	{
    	if(passedLanguage.equals("English") && passedRequestType.equals("Activation"))
    	{
			subject = "Activation Request";
			message = "Dear " + passedName + " your Email: " + passedEmail + " need to be activated click link below to activate your email" + "\n" + "www.linkExample.com";
    	}
    	else if(passedLanguage.equals("English") && passedRequestType.equals("Booking"))
    	{
    		subject = "Booking completed";
       	 	message = "Dear " + passedName + ", your booking of the " + passedItem + " is confirmed. thanks for using our store";
    	}	
    	else if(passedLanguage.equals("English") && passedRequestType.equals("Forget"))
    	{
    		subject = "Forgot password Request";
    		message = "Hi " + passedName + " We received a request to reset your password." + "\n" + "Enter following password reset code:" + "\n" +codeGenerator() ;
    	}
    	else if(passedLanguage.equals("French") && passedRequestType.equals("Activation"))
    	{
    		subject = "Demande d'activation";
    		message = "Cher " + passedName + " votre email: " + passedEmail + "doivent �tre activ�s cliquez sur le lien ci-dessous pour activer votre email" + "\n" + "www.linkExample.com";
    	}
    	else if(passedLanguage.equals("French") && passedRequestType.equals("Booking"))
    	{
    		subject = "R�servation termin�e";
    		message = "Cher " + passedName + ", votre r�servation de " + passedItem + "est confirm�e. merci d'utiliser notre boutique";
    	}	
    	else if(passedLanguage.equals("French") && passedRequestType.equals("Forget"))
    	{
    		subject = "Demande de restauration de mot de passe";
    		message = "Salut " + passedName + " Nous avons re�u une demande de r�initialisation de votre mot de passe." + "\n" + "Entrez le code de r�initialisation du mot de passe suivant:" + "\n" + codeGenerator();
    	}

	}

}
