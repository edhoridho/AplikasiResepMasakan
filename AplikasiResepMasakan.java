/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasiresepmasakan;

/**
 *
 * @author ACER A314
 */
public class AplikasiResepMasakan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Menjalankan aplikasi dengan membuka Menu Utama
        java.awt.EventQueue.invokeLater(() -> {
        new MenuUtamaFrame().setVisible(true);
        });
    }
    
}
