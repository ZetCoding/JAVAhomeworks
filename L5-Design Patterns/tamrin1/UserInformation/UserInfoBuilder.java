package UserInformation;

public class UserInfoBuilder<UserName1, FullName2, PassWord3, Age4, Address5, PhoneNumber6, EducationLevel7> {
    private UserName1 username;
    private FullName2 fullName;
    private PassWord3 passWord;
    private Age4 age;
    private Address5 address;
    private PhoneNumber6 phoneNumber;
    private EducationLevel7 educationLevel;

    public UserInfoBuilder setUsername(UserName1 username) {
        this.username = username;
        return this;
    }

    public UserInfoBuilder setFullName(FullName2 fullName) {
        this.fullName = fullName;
        return this;
    }

    public UserInfoBuilder setPassWord(PassWord3 passWord) {
        this.passWord = passWord;
        return this;
    }

    public UserInfoBuilder setAge(Age4 age) {
        this.age = age;
        return this;
    }

    public UserInfoBuilder setAddress(Address5 address) {
        this.address = address;
        return this;
    }

    public UserInfoBuilder setPhoneNumber(PhoneNumber6 phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserInfoBuilder setEducationLevel(EducationLevel7 educationLevel) {
        this.educationLevel = educationLevel;
        return this;
    }

    public UserInfo createUserInfo() {
        return new UserInfo(username, fullName, passWord, age, address, phoneNumber, educationLevel);
    }
}