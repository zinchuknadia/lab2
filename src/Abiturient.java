public class Abiturient {
    private String id,surname,name,pobatkovi,adress,phoneNumber;
    private double gpa;

    public Abiturient(String id, String surname, String name, String pobatkovi, String adress, String phoneNumber, double gpa){
        this.id=id;
        this.surname=surname;
        this.name=name;
        this.pobatkovi=pobatkovi;
        this.adress=adress;
        this.phoneNumber=phoneNumber;
        this.gpa=gpa;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPobatkovi(String pobatkovi) {
        this.pobatkovi = pobatkovi;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }
    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
    public String getPobatkovi() {
        return pobatkovi;
    }
    public String getAdress() {
        return adress;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public double getGpa() {
        return gpa;
    }

    boolean checkName(String name){
        if(this.name.equals(name)){
            return true;
        }
        return false;
    }

    boolean checkGPA(double grade){
        if(this.gpa==grade){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "\n" + id +"\t\t"+ surname +" "+ name +" "+ pobatkovi +"\t\t"+ adress +"\t\t"+ phoneNumber +"\t\t"+ gpa;

    }

}
