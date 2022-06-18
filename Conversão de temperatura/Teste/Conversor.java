package Teste;

import Classes.ConversaoTmp;

public class Conversor {
    public static void main(String[] args) {
        //Conversão de Celsius --> Kelvin
        //Conversão de Celsius --> Fahreheit
        ConversaoTmp c1 = new ConversaoTmp();
        c1.TemperaturaC = 12;
        c1.converterCk();
        c1.ConverterCF();
    }

}
