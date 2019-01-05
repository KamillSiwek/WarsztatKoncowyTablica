package pl.coderslab.warsztatkoncowytablica.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String name;
  @OneToMany(mappedBy = "author")
  private List<Ad> userAds = new ArrayList<Ad>();
  @OneToMany(mappedBy = "author")
  private List<Comment> userComments = new ArrayList<Comment>();


    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
