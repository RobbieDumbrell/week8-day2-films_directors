package models;



import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "films")
public class Film {

    private int id;
    private String title;
    private Director director;
    private int ageRating;
    private Genre genre;
    private Calendar releaseDate;

    public Film() {
    }

    public Film(String title, Director director, int ageRating, Genre genre, Calendar releaseDate) {
        this.title = title;
        this.director = director;
        this.ageRating = ageRating;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @ManyToOne
    @JoinColumn(name = "director_id", nullable = false)
    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Column(name = "age_rating")
    public int getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(int ageRating) {
        this.ageRating = ageRating;
    }
   @Enumerated(value= EnumType.STRING)
    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    @Column(name = "release_date")
    public Calendar getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Calendar releaseDate) {
        this.releaseDate = releaseDate;
    }
}
