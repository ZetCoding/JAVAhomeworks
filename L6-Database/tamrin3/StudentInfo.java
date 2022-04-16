public class StudentInfo {
    private String code;
    private String name;
    private int year;
    private double avg;

    public StudentInfo(String code, String name, int year, double avg) {
        this.code = code;
        this.name = name;
        this.year = year;
        this.avg = avg;
    }

    public StudentInfo() {}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
}
