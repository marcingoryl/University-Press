package pl.edu.pwsztar.universitypress.model;

import static javax.persistence.FetchType.EAGER;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;


@Entity
@NamedEntityGraph(name = "Book.authors",
        attributeNodes = @NamedAttributeNode("authors")
)
@NamedEntityGraph(name = "Book.authors-categories",
        attributeNodes = {
                @NamedAttributeNode("authors"),
                @NamedAttributeNode("categories")
        }
)

public class PaperBook extends Book {

    private String binding;

    @ManyToMany(fetch = EAGER)
    private List<Author> authors = new ArrayList<>();

    @ManyToMany
    private Set<Category> categories = new LinkedHashSet<>();

    public PaperBook() {
    }

    public PaperBook(String isbn, String title, String description, LocalDate publishingDate, String binding) {
        super(isbn, title, description, publishingDate);
        this.binding = binding;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    @Override
    public List<Author> getAuthors() {
        return null;
    }

    @Override
    public void setAuthors(List<Author> authors) {

    }

    @Override
    public Set<Category> getCategories() {
        return null;
    }

    @Override
    public void setCategories(Set<Category> categories) {

    }


}