public class Main {

  public static void main(String[] args) {

    EmailNotification myEmailNotification = new EmailNotification("Message undeliverable", "Your message could not be delivered because the recipient was not found on the target system", "I.C.Weiner@email.com", "outlook.com");
    TextNotification myTextNotification = new TextNotification("Delivery notice", "Your parcel has been delivered", "+17653162666", "sms.att.net");

    myEmailNotification.transport();
    myEmailNotification.showStatus();

    myTextNotification.transport();

    myEmailNotification.status = "read";

    myEmailNotification.showStatus();
  }

}
