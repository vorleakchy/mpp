package lab2.prob2c;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	List<Section> sectionList = new ArrayList<Section>();
	
	public void addSection(Section section) {
		sectionList.add(section);
	}
	
	public void dropSection(Section section) {
		sectionList.remove(section);
	}
	
	public String getName() {
		return name;
	}
}
