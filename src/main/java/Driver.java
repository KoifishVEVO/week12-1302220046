import src.main.java.Counter;
import java.util.logging.Logger;

public class Driver {

    private static final Logger logger = Logger.getLogger(Driver.class.getName());

    public static void main(String[] args) {

        Counter counter = new Counter();

        logger.info("Current count: " + counter.getCount());

        counter.increaseBy(5);
        logger.info("Current count: " + counter.getCount());

        counter.decreaseBy(2);
        logger.info("Current count: " + counter.getCount());

        counter.multiplyBy(6);
        logger.info("Current count: " + counter.getCount());
    }
}