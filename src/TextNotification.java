/**
 * Created by daxxon on 9/12/17.
 */
public class TextNotification extends Notification {

  private String recipient;
  private String smsProvider;

  public TextNotification (String subject, String body, String recipeint, String smsProvider) {
    super(subject, body);
    this.recipient = recipient;
    this.smsProvider = smsProvider;
    printSingleSpaghetti();
  }

  public String getRecipient () {
    return this.recipient;
  }

  public String getSmsProvider () {
    return this.smsProvider;
  }

  @Override
  public void transport () {
    System.out.println("Created at: " + this.getCreatedAt());
    System.out.println("Subject: " + this.getSubject());
    System.out.println("Body: " + this.getBody());
    System.out.println("Recipient: " + this.getRecipient());
    System.out.println("SMS Provider: " + this.getSmsProvider());
  }
}
