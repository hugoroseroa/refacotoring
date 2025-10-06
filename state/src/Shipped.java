public class Shipped implements OrderState {

    public void pagar(Order ctx) {
        throw new IllegalStateException("Ya fue pagada.");
    }

    public void enviar(Order ctx) {
        System.out.println("Ya está SHIPPED.");
    }

    public void cancelar(Order ctx) {
        System.out.println("Su orden fue cancelada");
    }

}
