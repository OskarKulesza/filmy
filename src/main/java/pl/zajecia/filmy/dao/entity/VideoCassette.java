package pl.zajecia.filmy.dao.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class VideoCassette
{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String tytul;
    private LocalDate rokProdukcji;

    public VideoCassette(Long id, String tytul, LocalDate rokProdukcji)
    {
        this.id = id;
        this.tytul = tytul;
        this.rokProdukcji = rokProdukcji;
    }

    public VideoCassette() { }

    public Long getId()
    {
        return id;
    }

    public String getTytul()
    {
        return tytul;
    }

    public LocalDate getRokProdukcji()
    {
        return rokProdukcji;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public void setTytul(String tytul)
    {
        this.tytul = tytul;
    }

    public void setRokProdukcji(LocalDate rokProdukcji)
    {
        this.rokProdukcji = rokProdukcji;
    }
}