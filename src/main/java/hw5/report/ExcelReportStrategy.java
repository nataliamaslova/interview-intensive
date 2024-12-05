package hw5.report;

public class ExcelReportStrategy implements ReportStrategy {
    @Override
    public void generate() {
        System.out.println("Fetching data for Excel...");
        System.out.println("Formatting data for Excel...");
        System.out.println("Generating Excel report...");
    }
}
