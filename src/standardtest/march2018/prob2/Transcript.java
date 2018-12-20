package standardtest.march2018.prob2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Transcript {
	private List<TranscriptEntry> transcriptEntries = new ArrayList<>();

	Transcript() {
	}

	public void addTranscriptEntry(LocalDate courseDate, String grade, Course course) {
		transcriptEntries.add(new TranscriptEntry(courseDate, grade, course));
	}
	
	public List<TranscriptEntry> getTranscriptEntries() {
		return transcriptEntries;
	}
}
