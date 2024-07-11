package rio.times;

import rio.times.repositories.Times;
import rio.times.repositories.TimesHelper;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        TimesHelper banco = new TimesHelper();

        Times fluminense = new Times("Fluminense", 1902);

        System.out.println(banco.inserir(fluminense)>0?"inseriu":"não inseriu");


        ArrayList<Times> timesRio = (ArrayList<Times>) banco.getTimes();
        Iterator proximo = timesRio.iterator();
        Times time;

        while(proximo.hasNext()){
            time = (Times) proximo.next();
            System.out.println(time.getNome());
        }
    }
}