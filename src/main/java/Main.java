import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);

        logger.log("Program started.");

        logger.log("Asking user to enter list size");
        System.out.println("Please enter list size");
        int listSize = scanner.nextInt();
        logger.log("User entered " + listSize + " as list size.");

        logger.log("Asking user to enter biggest element.");
        System.out.println("Please enter biggest element.");
        int biggest = scanner.nextInt();
        logger.log("User entered " + biggest + " as the biggest element.");

        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < listSize; i++) {
            randomList.add(random.nextInt(biggest));
        }

        logger.log("Creating the random list.");
        System.out.println("Here is your random list" + randomList);

        logger.log("Asking user to enter biggest number for filtration.");
        System.out.println("Please enter the biggest number for filtration");
        int filtration = scanner.nextInt();
        logger.log("User entered " + filtration + " as the filtration number.");

        Filter filter = new Filter(filtration);
        List<Integer> result = filter.filterOut(randomList);

        logger.log("Printing the result.");
        System.out.println(result);

        logger.log("The program finished.");

    }
}
