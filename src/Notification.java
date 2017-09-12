/**
 * Created by dw on 9/12/17.
 */
import java.time.*;

public class Notification {

  private LocalDateTime createdAt;
  private String subject;
  private String body;
  protected String status;

  public Notification (String subject, String body) {

    this.createdAt = LocalDateTime.now();
    this.subject = subject;
    this.body = body;
    this.status = "unread";

  }

  public LocalDateTime getCreatedAt () {
    return this.createdAt;
  }

  public String getSubject () {
    return this.subject;
  }

  public String getBody () {
    return this.body;
  }

  public void showStatus () {
    System.out.println("Notification status: " + this.status);
  }

  public void transport () {
    throw new NoTransportException();
  }

  protected void printSingleSpaghetti () {
    System.out.println("SPAGHETTO");
  }

}
