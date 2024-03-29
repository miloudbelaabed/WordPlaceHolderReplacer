# Word Placeholder Replacer

This project demonstrates how to use docx4j to replace placeholders in a Word document with actual values.

## Installation

To use this project, you will need to have the following dependencies installed:

- [Java SE Development Kit](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Docx4j](https://mvnrepository.com/artifact/org.docx4j/docx4j)
- [Jaxb](https://mvnrepository.com/artifact/org.glassfish.jaxb/jaxb-runtime/2.3.1)

This will create a `target` folder with the built `placeholder-replacer.jar` file.

## Usage
The WordPlaceHolderReplacer function is used to fill in placeholders in a Word template document using the Docx4J library. The function takes the following parameters:

* `templatePath` (String): The path to the Word template file.
* `outputPath (String)`: The path to save the output file.
* `placeholderValues` (Map<String, String>): A map of placeholder values to replace.


To use the Placeholder Replacer, follow these steps:
1. Create a Word document with placeholders in it, using the `${placeholder}` format.
2. Save the document as a `.docx` file.
3. Create a Hashmap data structures for holding placeholder values to replace.

```java
Map<String, String> placeholderValues = new HashMap<>();
        placeholderValues.put("fullName", "BELAABED Miloud");
        placeholderValues.put("dateNaissance", "22-01-1992");
        placeholderValues.put("lieuNaissance", "Khenchela");
        placeholderValues.put("numeroInscription", "01R01343023/65");
        placeholderValues.put("lieuEntretient", "BD DOUVA MED HUSSEIN-DEY - ALGER, (W. ALGER)");
        placeholderValues.put("tel", "0662 57 68 50");
        placeholderValues.put("dateConvocation", "04/02/2023");
        placeholderValues.put("heureConvocation", "08h00");
        
        //Call the function to fill the information in their corresponding placeholders.
        
        WordFillTemplate("Convocation.docx","Convocation_filled.docx",placeholderValues);
```
## Exceptions
The `WordFillTemplate` function may throw the following exceptions:

* `RuntimeException`: If there is an error loading the template file.
* `Docx4JException`: If there is an error replacing the placeholders or saving the modified document.
* These exceptions should be handled appropriately in the calling code to ensure the smooth execution of the program. It is recommended to use try-catch blocks to catch these exceptions and handle them accordingly.