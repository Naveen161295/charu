package org.base1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport1 {
	public static void report(String superfile) {
		File b=new File("C:\\Users\\Sekar\\eclipse-workspace\\CucumberClass1\\src\\test\\resources\\report");
		Configuration conf=new Configuration(b, "Adactin");
		conf.addClassifications("OS", "Windows 7 professional");
		conf.addClassifications("Browser", "chrome");
		conf.addClassifications("version", "92");
		conf.addClassifications("sprint", "37");
		conf.addClassifications("sign-off", "positive");
		List<String> c=new ArrayList<String>();
		c.add(superfile);
		ReportBuilder d=new ReportBuilder(c, conf);
		d.generateReports();
	}
}
