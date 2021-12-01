package pl.edu.pwsztar.universitypress.model;

import javax.persistence.ManyToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static javax.persistence.FetchType.EAGER;

public class EBook extends Book{

    private String numOfPages;

    @ManyToMany(fetch = EAGER)
    private List<Author> authors = new ArrayList<>();

    @ManyToMany
    private Set<Category> categories = new LinkedHashSet<>();

    public EBook() {}

    public EBook(String isbn, String title, String description, LocalDate publishingDate, String numOfPages){
        super(isbn, title, description, publishingDate);
        this.numOfPages = numOfPages;
    }

    public String getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(String numOfPages) {
        this.numOfPages = numOfPages;
    }

    @Override
    public List<Author> getAuthors() {
        return authors;
    }

    @Override
    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public Set<Category> getCategories() {
        return categories;
    }

    @Override
    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
