/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiresepmasakan;

/**
 *
 * @author ACER A314
 */
// Representasi data resep
public class Recipe {
    private int id;
    private String name;
    private String ingredients;
    private String steps;
    private byte[] image; // Untuk menyimpan gambar (opsional)

    // Constructor
    public Recipe(int id, String name, String ingredients, String steps, byte[] image) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
        this.steps = steps;
        this.image = image;
    }

    // Getter dan Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getIngredients() { return ingredients; }
    public void setIngredients(String ingredients) { this.ingredients = ingredients; }

    public String getSteps() { return steps; }
    public void setSteps(String steps) { this.steps = steps; }

    public byte[] getImage() { return image; }
    public void setImage(byte[] image) { this.image = image; }
}
