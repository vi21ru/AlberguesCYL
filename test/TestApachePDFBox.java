/*
 * This example is part of the iText 7 tutorial.
 */

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
 
/**
 * Simple Hello World example.
 */
public class TestApachePDFBox {
 
    public static final String DEST = "C:\\Users\\Angel\\hello_world.pdf";
 
    public static void main(String args[]) throws IOException {
     
        new TestApachePDFBox().createPDF();
     }
 
    private void createPDF()
    {
       final PDPage singlePage = new PDPage();
       final PDFont courierBoldFont = PDType1Font.TIMES_ROMAN;
       final int fontSize = 12;
       try (final PDDocument document = new PDDocument())
       {
          document.addPage(singlePage);
          final PDPageContentStream contentStream = new PDPageContentStream(document, singlePage);
          contentStream.beginText();
          contentStream.setFont(courierBoldFont, fontSize);
          contentStream.newLineAtOffset(150, 750);
          contentStream.showText("Hello PDFBox");
          contentStream.endText();
          contentStream.close();  // Stream must be closed before saving document.
          document.save("C:\\Users\\Angel\\HelloPDFBox.pdf");
       }
       catch (IOException err)
       {
          System.out.println("Exception while trying to create simple document - " + err);
       }
    }
}