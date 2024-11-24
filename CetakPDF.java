/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiresepmasakan;

/**
 *
 * @author ACER A314
 */
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class CetakPDF {
    public static void cetakSemuaResep(String dataResep) {
        try {
            PdfWriter writer = new PdfWriter("SemuaResep.pdf");
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);
            document.add(new Paragraph(dataResep));
            document.close();
            System.out.println("PDF Semua Resep berhasil dibuat!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void cetakResep(String dataResep) {
        try {
            PdfWriter writer = new PdfWriter("DetailResep.pdf");
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);
            document.add(new Paragraph(dataResep));
            document.close();
            System.out.println("PDF Resep berhasil dibuat!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


