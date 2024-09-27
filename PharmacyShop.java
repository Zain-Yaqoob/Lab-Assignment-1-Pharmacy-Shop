package Assignment1;

public class PharmacyShop {
    private Address address;
    private int medicineCount = 2;
    private Medicine[] medicines = new Medicine[medicineCount];
    private Person owner;
    private double totalRevenue = 0.0;

    public PharmacyShop() {
    }

    {
        medicines[0] =  new Medicine("M001", "B123", "PharmaCorp", new Date(15, 8, 2025), 100, "Paracetamol", 50.0);
        medicines[1] = new Medicine("M002", "B124", "HealthMed", new Date(10, 12, 2024), 80, "Ibuprofen", 75.0);
    }

    public PharmacyShop(Address address, int medicineCount, Person owner) {
        this.address = address;
        this.medicines = medicines;
        this.medicineCount = medicineCount;
        this.owner = owner;
    }

    public boolean searchMedicineById(String medicineId) {
        boolean found = false;
        for (int i = 0; i < medicineCount; i++) {
            if (medicineId.equals(medicines[i].getMedicineID())) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
        return found;
    }

    public void updateMedicine(String medicineId) {
        if (searchMedicineById(medicineId)) {

        }

    }

    public void searchMedicineByName(String name) {
        boolean found = false;
        for (int i = 0; i < medicineCount; i++) {
            if (name.equals(medicines[i].getName())) {
                found = true;
            }
        }
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
    public void printTotalRevenue() {
        System.out.println("Total Revenue: " + totalRevenue);
    }

    public void findExpiredMedicines(Date date) {
    }

    public void removeMedicine(String id) {
        for (int i = 0; i < medicineCount; i++) {
            if (medicines[i].getMedicineID().equals(id)) {
                System.out.println("Removing Medicine: " + medicines[i].getName());
                medicines[i] = medicines[medicineCount - 1];
                medicines[medicineCount - 1] = null;
                medicineCount--;
                return;
            }
        }
        System.out.println("Medicine not found!");
    }

    public void sellMedicine(String medicineId, int quantity) {
        for (Medicine medicine : medicines) {
            if (medicine != null && medicine.getMedicineID().equals(medicineId)) {
                if (medicine.getQuantity() >= quantity) {
                    medicine.setQuantity(medicine.getQuantity() - quantity);
                    totalRevenue += quantity * medicine.getPrice();
                    System.out.println("Sold " + quantity + " units of " + medicine.getName());
                    return;
                } else {
                    System.out.println("Not enough stock available!");
                    return;
                }
            }
        }
        System.out.println("Medicine not found!");
    }
    public void addMedicine(Medicine medicine) {
        if (medicineCount < medicines.length) {
            medicines[medicineCount++] = medicine;
        } else {
            System.out.println("Inventory is full!");
        }
    }
    public void displayMedicines() {
         for(int i = 0; i < medicineCount; i++) {
             if (medicines[i] != null) {
                 medicines[i].displayInformation();
                 System.out.println("-----");
             }
         }
    }
}


