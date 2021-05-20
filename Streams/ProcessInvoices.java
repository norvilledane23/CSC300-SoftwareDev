package processinvoices;
import java.util.*;

public class ProcessInvoices {
    public static void main(String[] args) {
        List<Invoice> invoices = new ArrayList<>();

        invoices.add(new Invoice(83,"Electric sander", 7, 57.98));
        invoices.add(new Invoice(24,"Power saw", 18, 99.99));
        invoices.add(new Invoice(7,"Sledge hammer", 11, 21.50));
        invoices.add(new Invoice(77,"Hammer", 76, 11.99));
        invoices.add(new Invoice(39,"Lawn mower", 3, 79.50));
        invoices.add(new Invoice(68,"Screwdriver", 106, 6.99));
        invoices.add(new Invoice(56,"Jig saw", 21, 11.00));
        invoices.add(new Invoice(3,"Wrench", 34, 7.50));
        
        // a)
        System.out.printf("Invoices sorted by part description:\n");
        invoices.stream()
            .sorted(Comparator.comparing(Invoice::getPartDescription)).forEach(System.out::println);
        
        // b)
        System.out.printf("\nInvoices sorted by price:\n");
        invoices.stream()
            .sorted(Comparator.comparing(Invoice::getPrice))
            .forEach(System.out::println);
        
        // c)
        System.out.printf("\nInvoices mapped to description and quantity:\n");
        invoices.stream()
            .sorted(Comparator.comparing(Invoice::getQuantity))
            .map(x -> String.format("Description: %-15s  Quantity: %-4d", x.getPartDescription() , x.getQuantity()))
            .forEach(System.out::println);
        
        // d)
        System.out.printf("\nInvoices mapped to description and invoice amount:\n");
        invoices.stream()
            .sorted(Comparator.comparing((invoice -> invoice.getQuantity()*invoice.getPrice())))
            .map(invoice -> String.format("Description: %-15s  Invoice amount: %-4.2f", invoice.getPartDescription() , invoice.getQuantity()*invoice.getPrice()))
            .forEach(System.out::println);
        
        // e)
        System.out.printf("\nInvoices mapped to description and invoice amount for invoices in the range 200-500:\n");
        invoices.stream()
            .filter(invoice -> invoice.getPrice()*invoice.getQuantity()>=200 && invoice.getPrice()*invoice.getQuantity()<=500)
            .sorted(Comparator.comparing((invoice -> invoice.getQuantity()*invoice.getPrice())))
            .map(invoice -> String.format("Description: %-15s  Invoice amount: %-4.2f", invoice.getPartDescription() , invoice.getQuantity()*invoice.getPrice()))
            .forEach(System.out::println);
    }
}
