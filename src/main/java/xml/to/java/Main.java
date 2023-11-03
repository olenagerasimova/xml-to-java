package xml.to.java;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {

    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(ValCurs.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        ValCurs arr = (ValCurs) unmarshaller.unmarshal(new File("src/main/resources/currency.xml"));
    }
}
