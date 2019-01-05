package pl.coderslab.warsztatkoncowytablica.Entities;

import pl.coderslab.warsztatkoncowytablica.Enums.Status;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Ad {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String title;
  private String description;
  private LocalDateTime expirationDate;
  private Status adStatus;
  @ManyToOne private User author;
  @OneToMany(mappedBy = "ad")
  private List<Comment> comments = new ArrayList<Comment>();


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(LocalDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public Status getAdStatus() {
    return adStatus;
  }

  public void setAdStatus(Status adStatus) {
    this.adStatus = adStatus;
  }

  public User getAuthor() {
    return author;
  }

  public void setAuthor(User author) {
    this.author = author;
  }

  public List<Comment> getComments() {
    return comments;
  }

  public void setComments(List<Comment> comments) {
    this.comments = comments;
  }
}
