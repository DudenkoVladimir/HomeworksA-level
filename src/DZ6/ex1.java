class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public String getNumber() {
        return number;
    }
}

public class ex1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone("123456789", "Samsung", 0.2);
        Phone phone2 = new Phone("987654321", "iPhone");
        Phone phone3 = new Phone();

        phone1.receiveCall("Alice");
        phone2.receiveCall("Bob");
        phone3.receiveCall("Charlie");

        System.out.println("Номер першого телефона: " + phone1.getNumber());
        System.out.println("Номер другого телефона: " + phone2.getNumber());
        System.out.println("Номер третього телефона: " + phone3.getNumber());
    }
}
