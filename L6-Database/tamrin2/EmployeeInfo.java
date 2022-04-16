public class EmployeeInfo {
    private int codeID;
    private String name;
    private String milliCod;
    private String fathername;
    private String currentPost;
    private String earning;
    private String resume;

    public EmployeeInfo(int codeID, String name, String milliCod, String fathername, String currentPost, String earning,String resume) {
        this.codeID = codeID;
        this.name = name;
        this.milliCod = milliCod;
        this.fathername = fathername;
        this.currentPost = currentPost;
        this.earning = earning;
        this.resume = resume;
    }

    public int uniqueID(int i){
        return i;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public EmployeeInfo() {}

    public int getCodeID() {
        return codeID;
    }

    public void setCodeID(int codeID) {
        this.codeID = codeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMilliCod() {
        return milliCod;
    }

    public void setMilliCod(String milliCod) {
        this.milliCod = milliCod;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getCurrentPost() {
        return currentPost;
    }

    public void setCurrentPost(String currentPost) {
        this.currentPost = currentPost;
    }

    public String getEarning() {
        return earning;
    }

    public void setEarning(String earning) {
        this.earning = earning;
    }
}
