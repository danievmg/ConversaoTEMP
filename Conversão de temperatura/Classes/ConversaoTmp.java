package Classes;

public class ConversaoTmp {
    //Metodo Construtor
    //Conversão de Celsius --> Kelvin k = C + 147
    //Conversão de Celsius --> Fahreheit F = 1.8 C + 32
    public int TemperaturaC;

    public void converterCk(){
        int Converti = TemperaturaC + 147;
        System.out.println("A Conversão de Cº Para kº é " +Converti);
    }
    public void ConverterCF(){
        double CovertiDN = (TemperaturaC*1.8)+32;
        System.out.println("A Conversaço de Cº para Fº é "+CovertiDN);
    }

}
