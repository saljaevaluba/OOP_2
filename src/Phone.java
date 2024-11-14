import java.util.Objects;

public class Phone {
    private int weight;
    private String number, model;

    public Phone()
    {
        number = "+71234567890";
        model = "default";
        weight = 10;
    }

    public Phone(String number, String model) throws Exception{
        if(!number.matches("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?)(-?\\d-?){7}$")) {throw new Exception("Неправильный формат номера");}

        this.number = number;
        this.weight = 10;
        this.model = model;
    }

    public Phone(String number, int weight, String model) throws Exception {
        this(number, model);
        this.weight = weight;
    }


    public String getNumber() {
        return number;
    }

    public int getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void print()
    {
        System.out.printf("Номер телефона: %s\n", number);
        System.out.printf("Модель телефона: %s\n", model);
        System.out.printf("Вес телефона: %d\n", weight);
    }

    public void receiveCall(String name) throws Exception
    {
        System.out.printf("Звонит %s\n", name);
    }

    public void receiveCall(String name, String number) throws Exception
    {
        if(!number.matches("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?)(-?\\d-?){7}$")) {throw new Exception("Неправильный формат номера");}

        System.out.printf("Звонит %s : %s\n", name, number);
    }

    public void sendMessage(String... numbers) {
        System.out.print("Сообщение отправлено: ");
        for(String i : numbers){
            System.out.print(i + " ");
        }
    }

    @Override
    public boolean equals(Object phone) {

        if (phone == null || getClass() != phone.getClass()) {
            return false;
        }

        return (Objects.equals(this.number, ((Phone) phone).getNumber()) & Objects.equals(this.model, ((Phone) phone).getModel()) & Objects.equals(this.weight, ((Phone) phone).getWeight()));
    }

    @Override
    public int hashCode() {
        int result = number != null ? number.hashCode() : 0;
        result = 31 * result + Objects.requireNonNull(number).hashCode();
        result = 31 * result + weight;
        return result;
    }

    @Override
    public String toString() {
        return "Phone{ number= " + number + ", model= " + model + ", weight= " + weight + "}";
    }

}
