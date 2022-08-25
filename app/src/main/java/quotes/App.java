/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;


public class App {

    public static void main(String[] args) throws IOException {
        System.out.println(returnSomething(5));
        System.out.println(returnSomething(6));

    }
    public static String returnSomething(int index) throws FileNotFoundException {
        Gson gson = new Gson();
        File jsonFile = new File("C:\\Users\\treve\\class401\\quotes\\app\\src\\main\\resources\\recentQuotes.json");
        FileReader jsonReader = new FileReader(jsonFile);
        Type collectionType = new TypeToken<Collection<Quotes>>() {
        }.getType();
        ArrayList<Quotes> quotesArr = gson.fromJson(jsonReader, collectionType);
//        System.out.println("Author: " + quotesArr.get(5).author + " Quote: " + quotesArr.get(5).text);
        return quotesArr.get(index).toString();
    }
}