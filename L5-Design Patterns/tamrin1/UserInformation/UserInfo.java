package UserInformation;

public class UserInfo<UserName1,FullName2,PassWord3,Age4,Address5,PhoneNumber6,EducationLevel7> {
    private UserName1 Username;
    private FullName2 FullName;
    private PassWord3 PassWord;
    private Age4 Age;
    private Address5 Address;
    private PhoneNumber6 PhoneNumber;
    private EducationLevel7 EducationLevel;

    public UserInfo(UserName1 username, FullName2 fullName, PassWord3 passWord, Age4 age, Address5 address,
                    PhoneNumber6 phoneNumber, EducationLevel7 educationLevel) {
        Username = username;
        FullName = fullName;
        PassWord = passWord;
        Age = age;
        Address = address;
        PhoneNumber = phoneNumber;
        EducationLevel = educationLevel;
    }
   public UserInfo(){}

    public UserName1 getUsername() {
        return Username;
    }

    public void setUsername(UserName1 username) {
        Username = username;
    }

    public FullName2 getFullName() {
        return FullName;
    }

    public void setFullName(FullName2 fullName) {
        FullName = fullName;
    }

    public PassWord3 getPassWord() {
        return PassWord;
    }

    public void setPassWord(PassWord3 passWord) {
        PassWord = passWord;
    }

    public Age4 getAge() {
        return Age;
    }

    public void setAge(Age4 age) {
        Age = age;
    }

    public Address5 getAddress() {
        return Address;
    }

    public void setAddress(Address5 address) {
        Address = address;
    }

    public PhoneNumber6 getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(PhoneNumber6 phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public EducationLevel7 getEducationLevel() {
        return EducationLevel;
    }

    public void setEducationLevel(EducationLevel7 educationLevel) {
        EducationLevel = educationLevel;
    }
}
