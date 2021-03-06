package pl.coderslab.app;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class MemoryBookService implements BookService{
    private List<Book> list = new ArrayList<>();
    private  BookService bookService;

    public MemoryBookService() {
        list.add(new Book(1L, "9788324631766", "Thiniking	in	Java", "Bruce	Eckel", "Helion", "programming"));
        list.add(new Book(2L, "9788324627738", "Rusz	glowa	Java.", "Sierra	Kathy,	Bates	Bert", "Helion",
                "programming"));
        list.add(new Book(3L, "9780130819338", "Java	2.	Podstawy", "Cay	Horstmann,	Gary	Cornell", "Helion",
                "programming"));
    }

    @Override
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @Override
    public void add(Book book) {

    }

    @Override
    public Optional<Book> get(Long id) {
        return Optional.empty();
    }

    @Override
    public void update(Book book) {

    }

    @Override
    public void delete(Long id) {

    }
}
