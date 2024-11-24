/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiresepmasakan;

/**
 *
 * @author ACER A314
 */
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

// Mengakses API Masak Apa Hari Ini
public class ApiHandler {
    private static final String API_URL = "https://masakapahariini.vercel.app/api/recipes?q=";
    private static OkHttpClient client = new OkHttpClient();

    // Mencari resep berdasarkan kata kunci
    public static String searchRecipes(String keyword) {
        try {
            String url = API_URL + keyword;
            Request request = new Request.Builder().url(url).get().build();
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                return response.body().string(); // JSON hasil API
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
