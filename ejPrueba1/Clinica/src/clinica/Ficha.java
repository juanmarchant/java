/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinica;

/**
 *
 * @author candyfloss
 */
public class Ficha {

    private double estatura, peso;
    private String tipoPrevision;
    private DatosPersonales dp;

    public Ficha(double estatura, double peso, String tipoPrevision, DatosPersonales dp) {
        this.estatura = estatura;
        this.peso = peso;
        this.tipoPrevision = tipoPrevision;
        this.dp = dp;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipoPrevision() {
        return tipoPrevision;
    }

    public void setTipoPrevision(String tipoPrevision) {
        this.tipoPrevision = tipoPrevision;
    }

    public DatosPersonales getDp() {
        return dp;
    }

    public void setDp(DatosPersonales dp) {
        this.dp = dp;
    }

    public double imc() {
        return peso / (estatura * estatura);
    }

    public String estadoPaciente() {
        if (imc() >= 18.5 && imc() < 25) {
            return "Normal";
        } else if (imc() >= 25 && imc() < 30) {
            return "Sobrepeso";
        } else if (imc() >= 30) {
            return "Obeso";
        } else {
            return "Delgadez";
        }
    }

    public double metabolismoBasal(int edad) {

        if (dp.getGenero().compareToIgnoreCase("masculino") == 0) {
            return (peso * 10) + (6.25 * estatura * 100) - (5 * edad) + 5;
        } else {
            return (peso * 10) + (6.25 * estatura * 100) - (5 * edad) - 161;
        }
    }

    public int valorConsulta() {
        if (tipoPrevision.compareToIgnoreCase("isapre") == 0) {
            return 2500;
        }
        if (tipoPrevision.compareToIgnoreCase("fonasa") == 0) {
            return 4500;
        }
        if (tipoPrevision.compareToIgnoreCase("particular") == 0) {
            return 7500;
        }
        return 0;
    }

    public int rebaja() {
        if (estadoPaciente().compareToIgnoreCase("sobrepeso") == 0 || estadoPaciente().compareToIgnoreCase("obeso") == 0) {
            return (int) (valorConsulta() * 0.3);
        } else {
            return 0;
        }
    }

    public int totalPagar() {
        return (int) valorConsulta() - rebaja();
    }
}
