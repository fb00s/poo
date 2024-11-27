/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista15.q2;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author gabri
 */
class Movimento {
    private double valor;
    private TipoMovimento tipo;
    private LocalDate localDate;
    private LocalTime localTime;

    public Movimento(double valor, TipoMovimento tipo) {
        this.valor = valor;
        this.tipo = tipo;
        this.localDate = LocalDate.now();
        this.localTime = LocalTime.now();
    }    


    public LocalDate getData() {
        return localDate;
    }

    public LocalTime getHora() {
        return localTime;
    }
    
    public double getValor() {
        return valor;
    }

    public TipoMovimento getTipoMovimento() {
        return tipo;
    }
        
}
