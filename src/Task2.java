public class Task2 {
    public void printName(String name, String surname){
        System.out.print("Your surname is: " + surname);
        System.out.print(", your name is: " + name);
    }
    public static void main(String[] args){
        Task2 person = new Task2();
        person.printName("Alexey", "Petrov");
    }
}
