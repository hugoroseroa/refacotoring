public class Pending implements OrderState {

    @Override
    public void pagar(Order order) {
        System.out.println("Pago recibido. Cambiando a PAID.");
        order.changeState(new Paid());
    }

    @Override
    public void enviar(Order ctx) {
        throw new IllegalStateException("No se puede enviar: el pedido está PENDING.");
    }


    @Override
    public void cancelar(Order ctx) {
        throw new IllegalStateException("No se puede enviar: Pedido cancelar.");
    }

}
