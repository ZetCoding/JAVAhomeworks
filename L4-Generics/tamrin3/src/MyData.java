public class MyData<Name,StudentNumber,FatherName> {
    private Name name;
    private StudentNumber sNumber;
    private FatherName fatherName;

    public MyData(Name name, StudentNumber sNumber, FatherName fatherName) {
        this.name = name;
        this.sNumber = sNumber;
        this.fatherName = fatherName;
    }

    MyData(){}


    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public StudentNumber getsNumber() {
        return sNumber;
    }

    public void setsNumber(StudentNumber sNumber) {
        this.sNumber = sNumber;
    }

    public FatherName getFatherName() {
        return fatherName;
    }

    public void setFatherName(FatherName fatherName) {
        this.fatherName = fatherName;
    }
}
