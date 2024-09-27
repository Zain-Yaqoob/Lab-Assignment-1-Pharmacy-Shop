package Assignment1;

public class Medicine {
    private String medicineID;
    private String batchNumber;
    private String manufacturer;
    private Date expiryDate;
    private int quantity;
    private String name;
    private double price;

    public Medicine(String medicineID, String batchNumber, String manufacturer, Date expiryDate, int quantity, String name, double price) {
        this.medicineID = medicineID;
        this.batchNumber = batchNumber;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }

    public String getMedicineID() {
        return medicineID;
    }

    public void setMedicineID(String medicineID) {
        this.medicineID = medicineID;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInformation(){
        System.out.println("Medicine ID: " + this.medicineID);
        System.out.println("Batch Number: " + this.batchNumber);
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println( "Expiry Date : " + String.format("%s-%s-%s ", expiryDate.getDay(),expiryDate.getMonth(),expiryDate.getYear()));
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price);
    }
}
