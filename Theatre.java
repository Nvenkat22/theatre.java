class Theatre 
{
public static void main(String[] args)
{
Theatre raja=new Theatre();
int balance_amount = raja.bookTicket(200);
System.out.println("Ticket Booking balance"+balance_amount);
}
int bookTicket(int ticket_booking)
{
int ticket_price=120;
int balance_amount = ticket_booking-ticket_price;
System.out.println("balance amount is"+balance_amount);
return balance_amount; 
}
}
