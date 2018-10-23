package Aula08;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Mes {
    String mes[][];

    public Mes() {
        this.mes = new String[2][12];

        Locale local1 = new Locale("pt","BR");
        Locale local2 = new Locale("en", "US");
        DateFormat dateFormat1 = new SimpleDateFormat("MMMM",local1);
        DateFormat dateFormat2 = new SimpleDateFormat("MMMM",local2);

        for(int i = 0; i < 12; i++){
            Date data = new Date(1, i, 1);
            this.mes[0][i] = dateFormat1.format(data);
            this.mes[1][i] = dateFormat2.format(data);
        }
    }

    public String getMesPorExtenso(int mes, int idioma){
        idioma--;
        mes--;

        return this.mes[idioma][mes];
    }
}
