package Assignment1;

public class Main {
    public static void main(String[] args) {
                PharmacyShop pharma = new PharmacyShop();
                //Searching medicine by ID//
                pharma.searchMedicineById("M003");
                //Searching medicine by Name//
                pharma.searchMedicineByName("Paracetamol");
                //Displaying Medicine//
                pharma.displayMedicines();
                Medicine m1 =  new Medicine("B001", "A123", "GSK", new Date(15, 8, 2025), 50, "Panadol", 100.0);
                Medicine m2 =  new Medicine("C001", "C123", "GSK", new Date(15, 8, 2025), 100, "Instazin", 100.0);
                //Adding a medicine//
                pharma.addMedicine(m1);
                pharma.displayMedicines();
                // Removing a medicine//
                pharma.removeMedicine("B001");
                //Selling a medicine//
                pharma.sellMedicine("C001",100);
                pharma.displayMedicines();

            }
        }
