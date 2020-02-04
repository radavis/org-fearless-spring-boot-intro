package org.fearless.springbootintro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping("/{isbn}")
    public Book findBook(@PathVariable String isbn) {
        Book book = new Book();
        book.setIsbn(isbn);
        book.setAuthor("Dr. Seuss");
        book.setTitle("Cat in the Hat");
        return book;
    }
}
