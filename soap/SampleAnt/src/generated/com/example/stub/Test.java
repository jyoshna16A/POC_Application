package generated.com.example.stub;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Test {
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		/*
		 * List<String> test = test1.getNumber(); test.add("0"); test.add("1");
		 * System.out.println(test);
		 */
		test1.setI(null);
		Integer i1 = test1.getI();
		
		List<String> list = test1.getAssociatedTNs();
		List<String> list1 = null;
		for(int i = 0 ; i < 2 ; i++) {
			list1 = new ArrayList<String>();
			list1.add("10");
			list.addAll(list1);
		}
		System.out.println("List : " + list);
		System.out.println("----");
		List<List<String>> outerList = new ArrayList<>();

		for (int i2 = 0; i2 < 2; i2++) {
		    List<String> innerList = new ArrayList<>();
		    innerList.add("10");
		    outerList.add(innerList);
		}

		for (List<String> list2 : outerList) {
		    System.out.println(list2);
		}
		System.out.println("------------");
		
		List<String> list3 = test1.getAssociatedTNs();
		List<String> list4 = null;

		for (int i = 0; i < 2; i++) {
			list4 = new ArrayList<String>();
			list4.add("10");
		    list3.addAll(list4);
		}

		// Simulate separate list display
		for (String s : list3) {
		    System.out.println("[" + s + "]");
		}
		
		System.out.println("======");
		Document doc = null;
		try {
			doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        Element element = doc.createElement("Number");
        element.setTextContent("22222");
        element.setTextContent("22333");

        String value = element.getTextContent();  // Get value from Element
        System.out.println("Value: " + value);   
		
		
		
		
		
		
	}
}
