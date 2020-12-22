package _02_Безверхий_Едуард_Володимирович.laba4;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        Airplane[] masAirplane = new Airplane[3];
        masAirplane[0] = new Airplane("red", 30, "Sukhoi SuperJet-100", 1000, new GregorianCalendar(2001, 0, 31));
        masAirplane[1] = new Airplane("blue", 24, "Airbus A310", 1800, new GregorianCalendar(2018, 1, 1));
        masAirplane[2] = new Airplane("black", 1, "Boeing-747", 2000, new GregorianCalendar(2000, 11, 25));

        System.out.println("начальный массив\n"+Arrays.toString(masAirplane)+"\n");

        Arrays.sort(masAirplane, Airplane.MassComparator);
        System.out.println("отсортированый по массе min _ max \n"+Arrays.toString(masAirplane)+"\n");

        Arrays.sort(masAirplane,Airplane.calendarComparator.reversed());
        System.out.println("отсортированый по дате изготовления от новых к старым\n"+ Arrays.toString(masAirplane));





    }

}


