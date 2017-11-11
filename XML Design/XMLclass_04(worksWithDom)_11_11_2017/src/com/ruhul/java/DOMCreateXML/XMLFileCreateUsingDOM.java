/*
XMLLecture-Working with DOM parser
MD. RUHUL AMIN
XMLDOM
Create XML file using Java
*/
package com.ruhul.java.DOMCreateXML;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLFileCreateUsingDOM {
    public static void main(String[] args) throws TransformerException {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            
            //root element
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("company");
            doc.appendChild(rootElement);
            
            //staff element
            Element staff = doc.createElement("staff");
            rootElement.appendChild(staff);
            
            //set attribute to staff element
            Attr attr = doc.createAttribute("id");
            attr.setValue("1");
            staff.setAttributeNode(attr);
            
            /*
            //Shoten way
            staff.setAttribute("id", "1");
            */
            
            //firstName elements
            Element firstName = doc.createElement("firstname");
            firstName.appendChild(doc.createTextNode("MD. RUHUL"));
            staff.appendChild(firstName);
            
            //lastname element
            Element lastName = doc.createElement("lastname");
            lastName.appendChild(doc.createTextNode("AMIN"));
            staff.appendChild(lastName);
            
            //nickname element
            Element nickName = doc.createElement("nickname");
            nickName.appendChild(doc.createTextNode("RUHUL"));
            staff.appendChild(nickName);
            
            //salary element
            Element salary = doc.createElement("salary");
            salary.appendChild(doc.createTextNode("50000"));
            staff.appendChild(salary);
            
            //country element
            Element country = doc.createElement("country");
            country.appendChild(doc.createTextNode("Bangladesh"));
            staff.appendChild(country);
            
            //write the content into XML file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("D:\\Users\\J2EE-33\\Documents\\NetBeansProjects\\"
                    + "XMLclass_04(worksWithDom)_11_11_2017\\src\\com\\ruhul\\java\\worksWithDom\\"
                    + "XMLFileCreate.XML"));
            
            //output to consol for testing
            //StreamResult result = new StreamResult(System.out);
            
            transformer.transform(source, result);
            System.out.println("File saved!!!");
            
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        }catch(TransformerException tfe){
            tfe.printStackTrace();
        }
    }
}
