 public class Main {
  
    public static void main(String[] args) {
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);

        person.setSeatNumber(person.chooseSeat());
        System.out.println("\nName: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");

        if (person.applyPassport()) {
            System.out.println("Congratulations " + person.getName() + ". Your passport was approved!\n");
        } else {
            System.out.println("We are sorry " + person.getName() + ". We cannot process your application.\n");
        }
    }
  
  
}
