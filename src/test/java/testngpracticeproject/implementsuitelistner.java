package testngpracticeproject;

import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

public class implementsuitelistner implements IReporter, ISuiteListener{

	public void generateReport(
		      List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {

			for(ISuite suit:suites)
			{
				String sn=suit.getName();
				Map<String, ISuiteResult> suiteResults = suit.getResults();
			for(ISuiteResult obj : suiteResults.values())
			{
				ITestContext tc = obj.getTestContext();
				
				System.out.println("Passed Tests of "  + sn + "=" +  tc.getPassedTests().getAllResults().size());
				
				System.out.println("Failed Tests of "  + sn + "=" +  tc.getFailedTests().getAllResults().size());
				
				System.out.println("Skipped Tests of "  + sn + "=" +  tc.getSkippedTests().getAllResults().size());
			}
			}
	}
	
			public void onStart(ISuite suite)
			{
				System.out.println("Started Suite : "+suite.getName());
			}
		
			public void onFinish(ISuite suite)
			{
				System.out.println("Finished Suite : " +suite.getName());
			}
			
							
}
