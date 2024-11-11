package InheritancePractice.AdvanceCollage;

class Person {
    protected String name;
    protected String phoneNumber;

    public Person(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void authorization(){
        System.out.println("Name is: \t" + getName());
        System.out.println("phoneNumber is: \t" + getPhoneNumber());
    }
}


class Instructor extends Person{
    protected String rank;
    protected String supervidedStudent;

    public Instructor(String name, String phoneNumber, String rank, String supervidedStudent) {
        super(name, phoneNumber);
        this.rank = rank;
        this.supervidedStudent = supervidedStudent;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSupervidedStudent() {
        return supervidedStudent;
    }

    public void setSupervidedStudent(String supervidedStudent) {
        this.supervidedStudent = supervidedStudent;
    }

    @Override
    public void authorization(){
        super.authorization();
        System.out.println("rank is: \t" + getRank());
        System.out.println("Supervisor Student is: \t" + getSupervidedStudent());
    }

}


class Student extends Person{
    protected double average ;
    protected int entranceYear;

    public Student(String name, String phoneNumber,double average,int entranceYear) {
        super(name, phoneNumber);
        this.average = average;
        this.entranceYear=entranceYear;
    }

    @Override
    public void authorization(){
        super.authorization();
        System.out.println("average is: \t" + getAverage());
        System.out.println("entranceYear is: \t" + this.getEntranceYear());
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public int getEntranceYear() {
        return entranceYear;
    }

    public void setEntranceYear(int entranceYear) {
        this.entranceYear = entranceYear;
    }
}

class GraduateStudent extends Student{

    protected String thesisTitle;
    protected String superVisor;

    public GraduateStudent(String name, String phoneNumber, double average, int entranceYear, String thesisTitle, String superVisor) {
        super(name, phoneNumber, average, entranceYear);
        this.thesisTitle = thesisTitle;
        this.superVisor = superVisor;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    public String getSuperVisor() {
        return superVisor;
    }

    public void setSuperVisor(String superVisor) {
        this.superVisor = superVisor;
    }

    @Override
    public void authorization(){
        super.authorization();
        System.out.println("thesisTitle is: \t" + getThesisTitle());
        System.out.println("superVisor is: \t" + getSuperVisor());
    }
}