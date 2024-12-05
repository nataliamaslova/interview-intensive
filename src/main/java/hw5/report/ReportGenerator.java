package hw5.report;

import java.util.HashMap;
import java.util.Map;

public class ReportGenerator {
    private final Map<String, ReportStrategy> strategies = new HashMap<>();

    public ReportGenerator() {
        strategies.put("pdf" , new PdfReportStrategy());
        strategies.put("excel", new ExcelReportStrategy());
    }

    public void generate(String type) {
        ReportStrategy strategy = strategies.get(type.toLowerCase());
        if (strategy != null) {
            strategy.generate();
        } else {
            System.out.println("Unknown report type");
        }
    }

    public static void main(String[] args) {
        ReportGenerator generator = new ReportGenerator();
        generator.generate("pdf");
        generator.generate("excel");
        generator.generate("doc");
    }
}
