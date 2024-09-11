// Interface untuk laporan
interface Report {
    void generate();
}

// Implementasi laporan untuk PDF
class PDFReport implements Report {
    @Override
    public void generate() {
        System.out.println("Generating PDF report...");
    }
}

// Implementasi laporan untuk Excel
class ExcelReport implements Report {
    @Override
    public void generate() {
        System.out.println("Generating Excel report...");
    }
}

// Kelas laporan generator yang menggunakan prinsip OCP
class ReportGenerator {
    private final Report report;

    public ReportGenerator(Report report) {
        this.report = report;
    }

    public void generateReport() {
        report.generate();
    }
}

// Kelas utama untuk menjalankan contoh
public class Main {
    public static void main(String[] args) {
        // Menghasilkan laporan PDF
        Report pdfReport = new PDFReport();
        ReportGenerator pdfReportGenerator = new ReportGenerator(pdfReport);
        pdfReportGenerator.generateReport();
        
        // Menghasilkan laporan Excel
        Report excelReport = new ExcelReport();
        ReportGenerator excelReportGenerator = new ReportGenerator(excelReport);
        excelReportGenerator.generateReport();
    }
}