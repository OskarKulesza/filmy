package pl.zajecia.filmy.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.zajecia.filmy.dao.VideoCassetteRepo;
import pl.zajecia.filmy.dao.entity.VideoCassette;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class VideoCassetteManager
{
    private VideoCassetteRepo videoCassetteRepo;

    @Autowired
    public VideoCassetteManager(VideoCassetteRepo videoCassetteRepo)
    {
        this.videoCassetteRepo = videoCassetteRepo;
    }

    public Optional<VideoCassette> findAllById(Long id)
    {
        return videoCassetteRepo.findById(id);
    }

    public Iterable<VideoCassette> findAll()
    {
        return videoCassetteRepo.findAll();
    }

    public  VideoCassette save(VideoCassette  videoCassette)
    {
        return videoCassetteRepo.save(videoCassette);
    }

    public void delete(Long id)
    {
        videoCassetteRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB()
    {
        save(new VideoCassette(1L, "Zielona mila", LocalDate.of(1999, 12, 6)));
        save(new VideoCassette(2L, "Gran Torino", LocalDate.of(2008, 12, 9)));
    }
}