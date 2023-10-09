import javax.swing.JOptionPane;

public class Payment {
    public static void main() {
        String paymentMethod = JOptionPane.showInputDialog("Select Payment Method:\n1. Cash\n2. Card Payment");

        if (paymentMethod == null) {
            JOptionPane.showMessageDialog(null, "Payment canceled.");
        } else if (paymentMethod.equals("1")) {
            JOptionPane.showMessageDialog(null, "Your Order has been received.");
        } else if (paymentMethod.equals("2")) {
            String cardNumber = JOptionPane.showInputDialog("Enter Your Card Number:");
            if (cardNumber != null && cardNumber.length() == 11) {
                JOptionPane.showMessageDialog(null, "Congratulations, Your Payment has been Successful.");
                System.out.println("\nCar rented successfully.");
            } else {
                String contactNumber = JOptionPane.showInputDialog("The card number entered by you is invalid\nEnter your contact number:");
                JOptionPane.showMessageDialog(null, "Our Receptionist will contact you soon.");
                System.out.println("\nCar is not rented now.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid option selected.");
            System.out.println("/nRental Cancelled.");
        }
    }
}
