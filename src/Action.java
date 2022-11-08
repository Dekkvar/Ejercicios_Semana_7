public class Action {
    Input input = new Input();
    String action = "";

    public String options() {
        while (action.equals("")) {
            System.out.println("¿Qué acción desea realizar?: \n- Retirar dinero \n- Salir");
            action = input.text().toLowerCase();
            if (!action.equals("retirar dinero") & !action.equals("salir")) {
                if (!action.equals("")) {
                    action = "";
                    System.out.println("Acción no válida.");
                }
            }
        }
        return action;
    }
}
