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
}
