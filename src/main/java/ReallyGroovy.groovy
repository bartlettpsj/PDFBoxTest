import org.apache.pdfbox.pdmodel.*
import org.apache.pdfbox.pdmodel.font.PDFont
import org.apache.pdfbox.pdmodel.font.PDType1Font

class ReallyGroovy {

    void sayHello() {
        println 'Hello Groovy!!'
        println myClosure(45)
    }

    def myClosure = { num -> num * 2 }

    String generatePdf(String filename, String message) {

        PDDocument doc = new PDDocument();

        try {
            PDPage page = new PDPage();
            doc.addPage(page);

            PDFont font = PDType1Font.HELVETICA_BOLD;

            PDPageContentStream contents = new PDPageContentStream(doc, page);
            contents.beginText();
            contents.setFont(font, 14);
            contents.newLineAtOffset(100, 700);
            contents.showText(message ?: filename);
            contents.endText();
            contents.close();

            doc.save(filename)

//            "open -a Preview.app $filename".execute().text
        }
        finally {
            doc.close();
        }


        return "Done"
    }
}
