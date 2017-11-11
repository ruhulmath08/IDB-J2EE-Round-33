/*
XMLLecture-Read XML file using DOM
MD. RUHUL AMIN
XMLDOM
Read XML file using DOM Java
*/

package com.ruhul.xml.DOMReadXML;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class NewClass {
    public static void main(String[] args) {
        try {
            File inputFile = new File("D:\\Users\\J2EE-33\\Documents\\NetBeansProjects\\XMLclass_04(worksWithDom)_"
                    + "11_11_2017\\src\\com\\ruhul\\xml\\DOMReadXML\\XMLPersonInfoDetails.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element : "+doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("student");
            System.out.println("-----------------------");
            
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :"+nNode.getNodeName());
                
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eEement = (Element)nNode;
                    System.out.println("Student roll no : "+eEement.getAttribute("rollno"));
                    System.out.println("First Name : "+eEement.getElementsByTagName("firstname").item(0).
                            getTextContent());
                    System.out.println("Last Name : "+eEement.getElementsByTagName("lastname").item(0).
                            getTextContent());
                    System.out.println("Nick Name : "+eEement.getElementsByTagName("nickname").item(0).
                            getTextContent());
                    System.out.println("Marks : "+eEement.getElementsByTagName("marks").item(0).
                            getTextContent());
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}