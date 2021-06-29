package entities;

import exceptions.DataException;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Data {

    private int dia;
    private int mes;
    private int ano;
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    GregorianCalendar gc;

    public Data(int dia, int mes, int ano) throws DataException {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.gc = new GregorianCalendar(ano, mes-1, dia);
        if(!confereData(this.dia, this.mes, this.ano, gc)){
            throw new DataException("Data inválida!");
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean confereData(int dia, int mes, int ano, GregorianCalendar gc){
        if (mes < 1 || mes > 12){
            return false;
        }
        if (dia < 1 || dia > 31){
            return false;
        }
        if (ano < 0){
            return false;
        }
        if (mes % 2 != 0 && mes >= 9 && dia == 31){
            return false;
        }
        if (mes % 2 == 0 && mes <= 6 && dia == 31){
            return false;
        }
        if (mes == 2){
            if (!gc.isLeapYear(ano) && dia > 28){
                return false;
            }
        }
        return true;
    }

    public String formata(){
        sdf.setCalendar(this.gc);
        String dateFormatted = sdf.format(this.gc.getTime());
        return dateFormatted;
    }

    public void adicionaDia(){
        this.gc.add(Calendar.DAY_OF_MONTH, 1);
    }

    @Override
    public String toString() {
        return formata();
    }
}
