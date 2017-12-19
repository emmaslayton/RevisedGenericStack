import static javafx.application.Application.launch;

/** "RevisedGenericStack
 *
 * @author emmaslayton
 * Created 2017
 *
 * Project 19; CSC201-004N
 * Assignment 19.1
 *
 */

import java.util.ArrayList;
import java.util.Arrays;

public class RevisedGenericStack<I extends Number> {
    public static void main(String[] args) {
        // Create a list
        String[] listStartup = {"London", "Paris", "Berlin"};
        ArrayList<Object> list = new ArrayList<>(Arrays.asList(listStartup));

        // Add some cities to the list
        list.add("Miami");
        list.add("Seoul");
        // contains [London, Paris, Berlin, Miami, Seoul]

        //list change
        int origSize = (listStartup.length);
        int newSize = (list.size());
        double pctSizeChange = ((1.0*(newSize)/origSize)*100);

        // Display the contents in the list
        System.out.println("Current List: ");
        System.out.print(list.toString());
        System.out.println("");
        System.out.println("");
        System.out.println("Is the list empty? " + list.isEmpty()); // Print True/false
        System.out.println("List size before execution of program: " + listStartup.length);
        System.out.println("Current list size? " + list.size());
        if (list.size() != listStartup.length) {
            System.out.printf("List size has grown by %5.2f", pctSizeChange);
            System.out.print("%.");
        }

    }
}
