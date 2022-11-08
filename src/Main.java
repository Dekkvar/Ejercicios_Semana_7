public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al cajero automático.");
        Action options = new Action();
        String action = options.options();
        while (!action.equals("salir")){
            System.out.println("\nIntroduce la cantidad a retirar:");
            Input num = new Input();
            int amount = num.num();
            if (amount % 5 != 0) {
                System.out.println("Cantidad inválida. Por favor introduzca una cantidad acabada en 0 o en 5.");
            } else {
                Money money = new Money();
                String cash = money.cash(amount);
                System.out.println(cash);
            }
            Action exit = new Action();
            action = exit.options();
        }
        System.out.println("Hasta pronto!");
    }

}
