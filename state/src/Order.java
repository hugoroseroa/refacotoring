public class Order {
    
    private OrderState state = new Pending();
    
    public void pagar()  {
        state.pagar(this);
    }
    
    public void enviar() {
        state.enviar(this);
    }

    public void cancelar() {
        state.cancelar(this);
    }

    void changeState(OrderState s) {
        this.state = s; 
    }

}
