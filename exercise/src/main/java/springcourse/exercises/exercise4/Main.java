package springcourse.exercises.exercise4;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springcourse.exercises.exercise4.model.Book;
import springcourse.exercises.exercise4.model.Member;

import java.util.Collection;

/**
 * @author Amit Tal
 * @since 3/24/14
 */
public class Main {

    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Library library = applicationContext.getBean(Library.class);

        // Commended code 1
        /*Collection<Book> allBooks = library.getAllBooks();
        Assert.assertNotNull(allBooks);
        Assert.assertTrue(allBooks.size() >= 5);
        logger.info("There are {} books", allBooks.size());*/

        // Commended code 2
        /*Collection<Member> allMembers = library.getAllMembers();
        Assert.assertNotNull(allMembers);
        Assert.assertTrue(allMembers.size() >= 3);
        logger.info("There are {} members", allMembers.size());*/
    }


}
