package Ingredients;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileReader {
    public void writeShoppingList(ArrayList<Ingredients> ingredients) {

        FileWriter writer = null;

        try {

            writer = new FileWriter("src\\Shopping List.txt");

            for (Ingredients ingredient : ingredients) {


                writer.write(ingredient.ShoppingList());


                writer.write("\n");
            }

            writer.flush();

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
