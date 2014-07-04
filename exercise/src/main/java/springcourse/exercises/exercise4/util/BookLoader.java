package springcourse.exercises.exercise4.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import springcourse.exercises.exercise4.Library;
import springcourse.exercises.exercise4.model.Book;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Amit Tal
 * @since 4/16/2014
 */
@Component
public class BookLoader {

    @Autowired
    private Library library;

    @PostConstruct
    public void loadBooks() throws IOException {
        ClassPathResource csvResource = new ClassPathResource("books.csv");
        BufferedReader br = null;
        String line = null;
        try {
            br = new BufferedReader(new InputStreamReader(csvResource.getInputStream()));
            while ((line = br.readLine()) != null) {
                String[] bookDetails = line.split(",");
                Book book = new Book(bookDetails[0], bookDetails[1]);
                book.setDetails(bookDetails[2]);
                library.addNewBook(book);
            }
        } finally {
            if (br != null) {
                try {br.close();} catch (Exception ex) {}
            }
        }

    }
}
