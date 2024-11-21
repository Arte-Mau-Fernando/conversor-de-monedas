package com.aluralatam.conversodemonedas.modelos;

import com.aluralatam.conversordemonedas.historial.Historial;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.time.*;

public class Menu{
    private Historial historial;
    public Menu(Historial historial) {
        this.historial = historial;}



    public void menu (int opcionSeleccionada){
        Scanner lectura = new Scanner(System.in);
        ConsultaApiMonedas consulta = new ConsultaApiMonedas();
        double monto =0;
        double convercion = 0;
        String monedaBase;
        String monedaDeCambio;
        String operacion = "";
        switch (opcionSeleccionada) {
            case 1:
                monedaBase = "USD";
                monedaDeCambio = "ARS";
                Monedas moneda = consulta.realizaConvercion
                        (monedaBase, monedaDeCambio);
                System.out.println("Ingresa el valor que deseas convertir: ");
                monto = Double.valueOf(lectura.next());
                convercion = monto * moneda.conversion_rate();
                operacion ="El valor " + monto +
                        " [" + monedaBase + "] corresponde al valor final de =>>> "
                        + convercion + " [" + monedaDeCambio + "]";
                System.out.println(operacion);
                historial.guardaHistorial(operacion);
                break;
            case 2:
                monedaBase = "ARS";
                monedaDeCambio = "USD";
                moneda = consulta.realizaConvercion
                        (monedaBase, monedaDeCambio);
                System.out.println("Ingresa el valor que deseas convertir: ");
                monto = lectura.nextDouble();
                convercion = monto * moneda.conversion_rate();
                operacion ="El valor " + monto +
                        " [" + monedaBase + "] corresponde al valor final de =>>> "
                        + convercion + " [" + monedaDeCambio + "]";
                System.out.println(operacion);
                historial.guardaHistorial(operacion);
                break;
            case 3:
                monedaBase = "USD";
                monedaDeCambio = "BRL";
                moneda = consulta.realizaConvercion
                        (monedaBase, monedaDeCambio);
                System.out.println("Ingresa el valor que deseas convertir: ");
                monto = lectura.nextDouble();
                convercion = monto * moneda.conversion_rate();
                operacion ="El valor " + monto +
                        " [" + monedaBase + "] corresponde al valor final de =>>> "
                        + convercion + " [" + monedaDeCambio + "]";
                System.out.println(operacion);
                historial.guardaHistorial(operacion);
                break;
            case 4:
                monedaBase = "BRL";
                monedaDeCambio = "USD";
                moneda = consulta.realizaConvercion
                        (monedaBase, monedaDeCambio);
                System.out.println("Ingresa el valor que deseas convertir: ");
                monto = lectura.nextDouble();
                convercion = monto * moneda.conversion_rate();
                operacion ="El valor " + monto +
                        " [" + monedaBase + "] corresponde al valor final de =>>> "
                        + convercion + " [" + monedaDeCambio + "]";
                System.out.println(operacion);
                historial.guardaHistorial(operacion);
            case 5:
                monedaBase = "USD";
                monedaDeCambio = "COP";
                moneda = consulta.realizaConvercion
                        (monedaBase, monedaDeCambio);
                System.out.println("Ingresa el valor que deseas convertir: ");
                monto = lectura.nextDouble();
                convercion = monto * moneda.conversion_rate();
                operacion ="El valor " + monto +
                        " [" + monedaBase + "] corresponde al valor final de =>>> "
                        + convercion + " [" + monedaDeCambio + "]";
                System.out.println(operacion);
                historial.guardaHistorial(operacion);
                break;
            case 6:
                monedaBase = "COP";
                monedaDeCambio = "USD";
                moneda = consulta.realizaConvercion
                        (monedaBase, monedaDeCambio);
                System.out.println("Ingresa el valor que deseas convertir: ");
                monto = lectura.nextDouble();
                convercion = monto * moneda.conversion_rate();
                operacion ="El valor " + monto +
                        " [" + monedaBase + "] corresponde al valor final de =>>> "
                        + convercion + " [" + monedaDeCambio + "]";
                System.out.println(operacion);
                historial.guardaHistorial(operacion);
            case 7:
                monedaBase = "USD";
                monedaDeCambio = "PEN";
                moneda = consulta.realizaConvercion
                        (monedaBase, monedaDeCambio);
                System.out.println("Ingresa el valor que deseas convertir: ");
                monto = lectura.nextDouble();
                convercion = monto * moneda.conversion_rate();
                operacion ="El valor " + monto +
                        " [" + monedaBase + "] corresponde al valor final de =>>> "
                        + convercion + " [" + monedaDeCambio + "]";
                System.out.println(operacion);
                historial.guardaHistorial(operacion);;
                break;
            case 8:
                monedaBase = "PEN";
                monedaDeCambio = "USD";
                moneda = consulta.realizaConvercion
                        (monedaBase, monedaDeCambio);
                System.out.println("Ingresa el valor que deseas convertir: ");
                monto = lectura.nextDouble();
                convercion = monto * moneda.conversion_rate();
                operacion ="El valor " + monto +
                        " [" + monedaBase + "] corresponde al valor final de =>>> "
                        + convercion + " [" + monedaDeCambio + "]";
                System.out.println(operacion);
                historial.guardaHistorial(operacion);
                break;
            case 9:
                monedaBase = "USD";
                monedaDeCambio = "MXN";
                moneda = consulta.realizaConvercion
                        (monedaBase, monedaDeCambio);
                System.out.println("Ingresa el valor que deseas convertir: ");
                monto = lectura.nextDouble();
                convercion = monto * moneda.conversion_rate();
                operacion ="El valor " + monto +
                        " [" + monedaBase + "] corresponde al valor final de =>>> "
                        + convercion + " [" + monedaDeCambio + "]";
                System.out.println(operacion);
                historial.guardaHistorial(operacion);
                break;
            case 10:
                monedaBase = "MXN";
                monedaDeCambio = "USD";
                moneda = consulta.realizaConvercion
                        (monedaBase, monedaDeCambio);
                System.out.println("Ingresa el valor que deseas convertir: ");
                monto = lectura.nextDouble();
                convercion = monto * moneda.conversion_rate();
                operacion ="El valor " + monto +
                        " [" + monedaBase + "] corresponde al valor final de =>>> "
                        + convercion + " [" + monedaDeCambio + "]";
                System.out.println(operacion);
                historial.guardaHistorial(operacion);
                break;
            case 11:
                System.out.println("Historial de Conversiones");
                historial.getListaDeOperaciaones().forEach(System.out::println);
                break;
            case 12:
                System.out.println("Fin del programa");
                break;
            default:
                System.out.println("     *****No se reconoció la opción que eligió*****");
                System.out.println("Vuelva a intentarlo, coloca el numero de la " +
                        "opción de cambio que deseas realizar");
                break;
        }
    }
}
