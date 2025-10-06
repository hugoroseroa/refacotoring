public interface OrderState {
    void pagar(Order ctx);
    void enviar(Order ctx);
    void cancelar(Order ctx);
}
