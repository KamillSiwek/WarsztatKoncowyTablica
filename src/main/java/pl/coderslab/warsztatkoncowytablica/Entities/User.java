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
    @OneToMany
    private List<Ad> userAds = new ArrayList<Ad>();
    @OneToMany
    private List<Comment> userComments  = new ArrayList<Comment>();
}
