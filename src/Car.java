public class Car {

    private int year;
    private int miles;
    private String company;
    private boolean energyEfficient;
    private boolean used;

    public Car (int year, int miles, String company, boolean energyEfficient, boolean used){
        this.year = year;
        this.miles = miles;
        this.company = company;
        this.energyEfficient = energyEfficient;
        this.used = used;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMiles(){
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean isEnergyEfficient() {
        return energyEfficient;
    }

    public void setEnergyEfficient(boolean energyEfficient) {
        this.energyEfficient = energyEfficient;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public String toString() {
        return "Car{" +
                "year = " + year +
                ", miles = " + miles +
                ", company = '" + company + '\'' +
                ", energyEfficient = " + energyEfficient +
                ", used=" + used +
                '}';
    }

}
