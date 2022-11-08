public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al cajero automático.");
        Action options = new Action();
        String action = options.options();
        while (!action.equals("salir")){
            Money money = new Money();
            String cash = money.cash();
            System.out.println(cash);
            Action exit = new Action();
            action = exit.options();
        }
        System.out.println("Hasta pronto!");
    }

}
