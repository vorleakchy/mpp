package standardtest.june2017.prob2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FulltimeStudent extends Student {
	private FulltimeTranscriptRecord record;

	public FulltimeStudent(String name, FulltimeTranscriptRecord record) {
		super(name);
		this.record = record;
	}

	@Override
	public double computeGpa() {
		// TODO Auto-generated method stub

		return Stream.concat(
				record.getFallTranscript().getGrades().stream(), 
				record.getSpringTranscript().getGrades().stream()
			)
			.mapToDouble(g -> g)
			.average()
			.orElse(0.0);
	}
}
