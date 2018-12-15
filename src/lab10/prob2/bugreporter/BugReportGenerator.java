package lab10.prob2.bugreporter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.logging.Logger;
import java.util.stream.Collectors;

import lab10.prob2.classfinder.ClassFinder;

/**
 * This class scans the package lab10.prob2.javapackage
 * for classes with annotation @BugReport. It then generates a bug report
 * bugreport.txt, formatted like this:
 * 
 * Joe Smith
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 * Tom Jones
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 * 
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
	private static final String PACKAGE_TO_SCAN = "lab10.prob2.javapackage";
	private static final String REPORT_NAME = "bug_report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";
	public void reportGenerator() {
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);
		//implement
		
		String report = classes.stream()
				.map(this::prepareReport)
				.collect(Collectors.joining("\n"));
		
		System.out.println(report);
		
		writeToFile(report);
	}
	
	private void writeToFile(String text) {
		try {
			FileWriter writer = new FileWriter(REPORT_NAME);
			writer.write(text);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private String prepareReport(Class<?> klass) {
		StringBuilder builder = new StringBuilder();

		BugReport annotation = (BugReport)klass.getAnnotation(BugReport.class);
		
		builder.append(annotation.assignedTo());
		builder.append("\n");
		
		builder.append(String.format("    %s %s\n", REPORTED_BY, annotation.reportedBy()));
		builder.append(String.format("    %s %s\n", CLASS_NAME, klass.getName()));
		builder.append(String.format("    %s %s\n", DESCRIPTION, annotation.description()));
		builder.append(String.format("    %s %s\n", SEVERITY, annotation.severity()));
		
		return builder.toString();
	}
	
}
