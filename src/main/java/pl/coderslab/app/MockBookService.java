package pl.coderslab.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

public class MockBookService {
    private List<Book> list=new ArrayList<>();

    public MockBookService() {
        list.add(new Book(1L, "9788324631766", "Thiniking	in	Java", "Bruce	Eckel", "Helion", "programming"));
        list.add(new Book(2L, "9788324627738", "Rusz	glowa	Java.", "Sierra	Kathy,	Bates	Bert", "Helion",
                "programming"));
        list.add(new Book(3L, "9780130819338", "Java	2.	Podstawy", "Cay	Horstmann,	Gary	Cornell", "Helion",
                "programming"));
    }

}
