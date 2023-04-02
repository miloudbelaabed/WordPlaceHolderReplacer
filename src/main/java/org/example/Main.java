package org.example;
import org.docx4j.Docx4J;
import org.docx4j.model.datastorage.migration.VariablePrepare;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.WordprocessingML.MainDocumentPart;
import javax.xml.bind.JAXBException;
import java.io.File;

import java.util.HashMap;
import java.util.Map;

public class Main {
<<<<<<< HEAD
    
=======

>>>>>>> 38fc810540f5a51aeea00a963fd029b253c4256a
    public static void WordFillTemplate(String templatePath,String outputPath,Map<String, String> placeholderValues) {
        WordprocessingMLPackage template = null;
        try {
            template = Docx4J.load(new File(templatePath));
            VariablePrepare.prepare(template);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // Get the main document part
        MainDocumentPart documentPart = template.getMainDocumentPart();



        try {
            // Replace the placeholders with values
            documentPart.variableReplace(placeholderValues);
            // Save the modified document
            Docx4J.save(template, new File(outputPath));

        } catch (JAXBException | Docx4JException e) {
            System.out.println(e.getMessage());
        }



        System.out.println("Contract template created successfully!");

    }

    public static void main(String[] args) {
        Map<String, String> placeholderValues = new HashMap<>();
        placeholderValues.put("fullName", "BELAABED Miloud");
        placeholderValues.put("dateNaissance", "22-01-1992");
        placeholderValues.put("lieuNaissance", "Khenchela");
        placeholderValues.put("numeroInscription", "01R01343023/65");
        placeholderValues.put("lieuEntretient", "BD DOUVA MED HUSSEIN-DEY - ALGER, (W. ALGER)");
        placeholderValues.put("tel", "0662 57 68 50");
        placeholderValues.put("dateConvocation", "04/02/2023");
        placeholderValues.put("heureConvocation", "08h00");
        WordFillTemplate("Convocation.docx","Convocation_filled.docx",placeholderValues);

































//        NuxeoClient client = new NuxeoClient.Builder()
//                .url("http://localhost:8080/nuxeo")
//                .authentication("Administrator", "Administrator")
//                .schemas("*") // fetch all document schemas
//                .connect();
//        String title = domain.getPropertyValue("dc:title");// should be equal to "Domain"
//        System.out.println(title);
//        Repository repository = client.repository();
//        Document folder = Document.createWithName("maladie","Folder");
//        repository.createDocumentByPath("/default-domain/workspaces",folder);
//        Document note = Document.createWithName("note001", "Note");
//        note = repository.createDocumentByPath("/default-domain/workspaces/maladie", note);
//        System.out.println(note.getProperties());
//        Document file = Document.createWithName("file001", "File");

//        file = repository.createDocumentById(folder.getId(), file);
//        System.out.println(file.getProperties());


//        XWPFParagraph paragraph = document.createParagraph();
//        paragraph.setAlignment(ParagraphAlignment.CENTER);
//        XWPFRun run = paragraph.createRun();
//        run.setText("Build Your REST API with Spring");
//        run.setColor("009933");
//        run.setBold(true);
//        run.setFontFamily("Courier");
//        run.setFontSize(20);
//        try {
//            FileOutputStream out = new FileOutputStream(new File("E:\\"));
//            document.write(out);
//            out.close();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//        document.close();
    }
}