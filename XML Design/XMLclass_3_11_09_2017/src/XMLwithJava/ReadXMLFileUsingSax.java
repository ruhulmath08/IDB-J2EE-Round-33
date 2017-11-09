package XMLwithJava;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ReadXMLFileUsingSax {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxarser = factory.newSAXParser();
            
            DefaultHandler handler = new DefaultHandler(){
                boolean bfname = false;
                boolean bsalary = false;
                boolean bage = false;

                @Override
                public void startElement(String uri, String localName, String qName, 
                        Attributes attributes) throws SAXException {
                    //System.out.println("Start Element : " +qName);
                    
                    if (qName.equalsIgnoreCase("FULLNAME")) {
                        bfname = true;
                    }
                    if (qName.equalsIgnoreCase("SALARY")) {
                        bsalary = true;
                    }
                    if (qName.equalsIgnoreCase("age")) {
                        bage = true;
                    }
                } 

                @Override
                public void endElement(String uri, String localName, String qName) throws SAXException {
                    //System.out.println("End Element : "+qName);
                }
                
                @Override
                public  void characters(char[] ch, int start, int length) throws SAXException{
                    if (bfname) {
                        System.out.println("Full Name : "+ new String(ch, start, length));
                        bfname = false;
                    }
                    if (bsalary) {
                        System.out.println("Salary : "+ new String(ch, start, length));
                        bsalary = false;
                    }
                    if (bage) {
                        System.out.println("Age : "+new String(ch, start, length));
                        bage = false;
                        System.out.println("");
                    }
                }
                
            };
            
            saxarser.parse("D:\\Users\\J2EE-33\\Documents\\NetBeansProjects\\XMLclass_03_11_09_2017\\"
                    + "src\\XMLwithJava\\XMLex.xml", handler);
        } catch (IOException | ParserConfigurationException | SAXException e) {
            System.out.println(e);
        }
    }
}
