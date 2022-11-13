package zz.PracticasUdemy.z5.EjemploFacturas.Personal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura {

    Cliente cliente;
    List<ItemFactura> listaFacturas1 = new ArrayList<>();
    int folio;
    String descr;
    Date fecha;

    public Factura() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemFactura> getListaFacturas1() {
        return listaFacturas1;
    }

    public void setListaFacturas1(List<ItemFactura> listaFacturas1) {
        this.listaFacturas1 = listaFacturas1;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double calcularTotal () {

        double totalFacturas = 0;

        for (ItemFactura total: listaFacturas1) {
            totalFacturas += total.calcularImporte();
        }

        return totalFacturas;
    }

    public String verDetalle () {

        StringBuilder sb = new StringBuilder("Factura del cliente ").append(cliente.getNombre().toUpperCase())
                .append(" con DNI ").append(cliente.getNif())
                .append("\n Imprimiendo la factura con nº ").append(folio)
                .append(" y descripción ").append(descr)
                .append(" formalizada en la fecha: ").append(fecha)
                .append("\n")
                .append(" Los productos recogidos en esta factura son: ")
                .append("\n=========================================================\n")
                .append("=  NOMBRE        CODIGO         PRECIO       CANTIDAD   =")
                .append("\n=========================================================\n");

        for (ItemFactura listaItems : listaFacturas1) {

            sb.append(listaItems.getProducto().getNombre()).append(" --- ").append(listaItems.getProducto().getCodigo()).append(" --- ").append(listaItems.getProducto().getPrecio())
                    .append(" --- ").append(listaItems.getCantidad()).append("\n");
        }

        sb.append("El precio total de esta factura asciende a: ")
                .append(calcularTotal());

        return sb.toString();
    }

}
