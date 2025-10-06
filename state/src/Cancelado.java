public class Cancelado implements OrderState {
    @Override
    public void pagar(Order ctx) {
        throw new IllegalStateException("La orden pagada se procede a cancelar");
    }

    @Override
    public void enviar(Order ctx) { throw new IllegalStateException("La orden enviada. No se puede cancelar");}

    @Override
    public void cancelar(Order ctx) { throw new IllegalStateException("Su orden fue cancelada");}
}
