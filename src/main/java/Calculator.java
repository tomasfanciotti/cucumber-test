public class Calculator {

    int anOperand;
    int response;

    public int getResponse() {
        return response;
    }

    public void addNumber(int number) {
        anOperand = number;
    }

    public void sumNumber(int number) {
        response = anOperand + number;
    }

    public void substact(int number) {
        response = anOperand - number;
    }
}
