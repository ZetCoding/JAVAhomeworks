public class Person<Thing,Thing2,Thing3> implements Cloneable{
    private Thing data;
    private Thing data2;
    private Thing3 data3;

    public Thing getData2() {
        return data2;
    }

    public void setData2(Thing data2) {
        this.data2 = data2;
    }

    public Thing3 getData3() {
        return data3;
    }

    public void setData3(Thing3 data3) {
        this.data3 = data3;
    }

    Person(){}

    public Person(Thing data,Thing2 data2,Thing3 data3) {
        this.data = data;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public Thing getData() {
        return data;
    }

    public void setData(Thing data) {
        this.data = data;
    }
}
