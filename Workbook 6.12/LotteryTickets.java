import java.util.Arrays;

public class LotteryTickets {
    public static void main(String[] args) {

        // Instructions for this workbook are on Learn the Part (workbook 6.12)
        int[] ticket = {34, 43, 45, 65, 21, 54};
        int[] ticket2 =  Arrays.copyOf(ticket, ticket.length);

        System.out.print("Ticket 1 numbers: ");
        //Task 3 - Call printTicketNumbers for int[] ticket.
        printTicketNumbers(ticket);
        System.out.print("Ticket 2 numbers: ");
        printTicketNumbers(ticket2);
        //Task 3 - Call printTicketNumbers for int[] ticket2.
    }

      /**
     * Function name -- printTicketNumbers
     * @param ticket ( int[] )
     *
     * Inside the function:
     *   1. Use a loop to print the numbers in one line.
     *         System.out.print(ticket[i] + " ");
     *
     *   2. After the loop, print two new lines.
     *         System.out.print("\n\n");
     *
     */

     public static void printTicketNumbers(int[] ticket) {
      for (int i = 0; i < ticket.length; i++) {
        System.out.print(ticket[i] + " ");

      }
      System.out.print("\n\n");
     }

}
