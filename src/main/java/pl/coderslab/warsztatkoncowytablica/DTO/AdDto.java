package pl.coderslab.warsztatkoncowytablica.DTO;



public class AdDto {

    private Long Id;
    private String title;
    private String description;

    public AdDto() {
    }

    public AdDto(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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
}
