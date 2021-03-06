package pl.coderslab.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
   private  BookService bookService;
   public BookController(BookService bookService){

       this.bookService=bookService;
   }
   @GetMapping("")
   public @ResponseBody
    List<Book>getList(){
       return bookService.getBooks();
   }

    @RequestMapping("/helloBook")
    public Book helloBook() {
        return new Book(1L, "9788324631766", "Thinking in Java",
                "Bruce Eckel", "Helion", "programming");
    }
}
