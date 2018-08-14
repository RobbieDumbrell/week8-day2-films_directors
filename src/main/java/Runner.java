import db.DBHelper;
import models.Director;
import models.Film;
import models.Genre;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Runner {

    public static void main(String[] args) {

        Calendar date1 = new GregorianCalendar(1982, 01, 01);
        Calendar date2 = new GregorianCalendar(1993, 00, 24);


        Director spielberg = new Director("Steven Spielberg");
        Director scorsese = new Director("Martin Scorsese");
        Director burton = new Director("Tim Burton");
        Director jackson = new Director("Peter Jackson");

        Film jaws = new Film("Jaws", spielberg, 12 , Genre.ACTION, date1);
        Film indianaJones = new Film("Indiana Jones", spielberg, 5 , Genre.ADVENTURE, date2);
        Film goodFellas = new Film("Goodfellas", scorsese, 18 , Genre.ACTION, date2);
        Film willyWonka = new Film("Willy Wonka", burton, 12 , Genre.ADVENTURE, date2);

        DBHelper.save(spielberg);
        DBHelper.save(scorsese);
        DBHelper.save(burton);
        DBHelper.save(jackson);
        DBHelper.save(jaws);
        DBHelper.save(indianaJones);
        DBHelper.save(goodFellas);
        DBHelper.save(willyWonka);

    }
}
