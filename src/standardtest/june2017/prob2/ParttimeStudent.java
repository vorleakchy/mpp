package standardtest.june2017.prob2;
import java.util.*;
public class ParttimeStudent extends Student {
	
	private ParttimeTranscriptRecord record;

	public ParttimeStudent(String name, ParttimeTranscriptRecord record) {
		super(name);
		this.record = record;
	}

	@Override
	public double computeGpa() {
		// TODO Auto-generated method stub
		
		return record.getGrades().stream()
				.mapToDouble(g -> g)
				.average()
				.orElse(0.0);
	}
	
	
}
