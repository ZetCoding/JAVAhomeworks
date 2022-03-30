public class MyInfo<TName,TFamily,TAge,TUserName,TPass,TJob> {
    private TName myName;
    private TFamily myFamily;
    private TAge myAge;
    private TUserName myUser;
    private TPass myPass;
    private TJob muJob;

    public MyInfo(TName myName, TFamily myFamily, TAge myAge, TUserName myUser, TPass myPass, TJob muJob) {
        this.myName = myName;
        this.myFamily = myFamily;
        this.myAge = myAge;
        this.myUser = myUser;
        this.myPass = myPass;
        this.muJob = muJob;
    }

    MyInfo(){}

    public TName getMyName() {
        return myName;
    }

    public void setMyName(TName myName) {
        this.myName = myName;
    }

    public TFamily getMyFamily() {
        return myFamily;
    }

    public void setMyFamily(TFamily myFamily) {
        this.myFamily = myFamily;
    }

    public TAge getMyAge() {
        return myAge;
    }

    public void setMyAge(TAge myAge) {
        this.myAge = myAge;
    }

    public TUserName getMyUser() {
        return myUser;
    }

    public void setMyUser(TUserName myUser) {
        this.myUser = myUser;
    }

    public TPass getMyPass() {
        return myPass;
    }

    public void setMyPass(TPass myPass) {
        this.myPass = myPass;
    }

    public TJob getMuJob() {
        return muJob;
    }

    public void setMuJob(TJob muJob) {
        this.muJob = muJob;
    }
}
