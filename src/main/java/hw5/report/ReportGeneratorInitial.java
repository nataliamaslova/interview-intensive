package hw5.report;

public class ReportGeneratorInitial {
    public void generate(String type) {
        if (type.equals("pdf")) {
            System.out.println("Fetching data for PDF...");
            System.out.println("Formatting data for PDF...");
            System.out.println("Generating PDF report...");
        } else if (type.equals("excel")) {
            System.out.println("Fetching data for Excel...");
            System.out.println("Formatting data for Excel...");
            System.out.println("Generating Excel report...");
        } else {
            System.out.println("Unknown report type.");
        }
    }
}
