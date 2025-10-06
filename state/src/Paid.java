public class Paid implements OrderState {

    @Override
    public void pagar(Order ctx) {
        throw new IllegalStateException("Ya está pagado.");
    }

    @Override
    public void enviar(Order ctx) {
        System.out.println("Enviando pedido. Cambiando a SHIPPED.");
        ctx.changeState(new Shipped());
    }

    @Override
    public void cancelar(Order ctx) {
        throw new IllegalStateException("Se encuentra pagado. Se procede a cancelar el pedido.");
    }

}
