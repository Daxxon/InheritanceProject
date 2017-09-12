/**
 * Created by daxxon on 9/12/17.
 */
public class EmailNotification extends Notification implements Cloneable {

  private String recipient;
  private String smtpProvider;

  public EmailNotification (String subject, String body, String recipient, String smtpProvider) {
    super(subject, body);
    this.recipient = recipient;
    this.smtpProvider = smtpProvider;
    printSingleSpaghetti();
  }

  public String getRecipient () {
    return this.recipient;
  }

  public String getSmtpProvider () {
    return this.smtpProvider;
  }

  @Override
  public void transport () {
    System.out.println("Created at: " + this.getCreatedAt());
    System.out.println("Subject: " + this.getSubject());
    System.out.println("Body: " + this.getBody());
    System.out.println("Recipient: " + this.getRecipient());
    System.out.println("smtpProvider: " + this.getSmtpProvider());
  }

  @Override
  public void printSingleSpaghetti () {
    System.out.println("this is not spaghetti...");
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    EmailNotification that = (EmailNotification) o;

    if (recipient != null ? !recipient.equals(that.recipient) : that.recipient != null) return false;
    return smtpProvider != null ? smtpProvider.equals(that.smtpProvider) : that.smtpProvider == null;
  }

  @Override
  public int hashCode() {
    int result = recipient != null ? recipient.hashCode() : 0;
    result = 31 * result + (smtpProvider != null ? smtpProvider.hashCode() : 0);
    return result;
  }
  
}
