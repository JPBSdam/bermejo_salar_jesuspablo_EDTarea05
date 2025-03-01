public class Pedido {
    private Cliente cliente;
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void procesarPedido(double total, boolean esVIP) {
        double descuento = 0;

        if (total > 100) {
            descuento = total * (esVIP ? 0.15 : 0.10); // 15% si es VIP, 10% si no
        }

        double precioFinal = total - descuento;
        String tipoPedido = esVIP ? "Pedido VIP aprobado" : "Pedido aprobado";

        System.out.println(tipoPedido + ". Total: " + precioFinal +
                (descuento > 0 ? " (descuento aplicado: " + descuento + ")" : ""));
    }
}
