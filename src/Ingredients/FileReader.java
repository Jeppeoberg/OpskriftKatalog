package Ingredients;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileReader {
    public void writeShoppingList(ArrayList<Ingredients> ingredients) {

        FileWriter writer = null;

        try {

            writer = new FileWriter();

            for (Ingredients ingredient : ingredients) {

                // Polymorphism in action
                writer.write(ingredient.ShoppingList());

                // FileWriter has no newLine() method
                writer.write("\n");
            }

            writer.flush(); // ensure data is written

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
