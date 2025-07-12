package examFinal.question6;

public interface BillingProcessor {
    boolean processBill(String patientId, double amount);

    default void printDetailBill(String patientId, double amount) {
        String formattedBill = formatDetailedBill(patientId, amount);
        System.out.println(formattedBill);
    }

    private String formatDetailedBill(String patientId, double amount) {
        String formattedDetails = String.format("Hospital Bill for Patient %s, $%.2f processed", patientId, amount);
        return formattedDetails;
    }

    static boolean validateInsuranceId(String insuranceId) {
        return insuranceId.matches("^[0-9]{10}$");
    }

    static boolean validatePatientId(String insuranceName) {
        return insuranceName.startsWith("HSP") && insuranceName.length() == 8;
    }
}
