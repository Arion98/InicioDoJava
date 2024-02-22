package com.example.demo.Model;

public class Carteira {
    
    private double valor;

    public Carteira(Double valor){
        this.valor = valor;
    }

    public void setValor(Double valor){
        this.valor = valor;
    }

    public boolean diminuirSaldo(Double valor) {
        if (this.valor >= valor) {
            
            this.valor = this.valor - valor;
            return true;
        } else {
            
            return false;
        }
    }
    

    public Double getValor(){
        return this.valor;
    }

}
