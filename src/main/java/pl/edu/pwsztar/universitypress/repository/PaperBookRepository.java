package pl.edu.pwsztar.universitypress.repository;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.pwsztar.universitypress.model.PaperBook;


public interface PaperBookRepository extends JpaRepository<PaperBook, Long> {
    List<PaperBook> findByTitleContaining(String title);
    List<PaperBook> findByPublishingDateBefore(LocalDate publishingDate);
}