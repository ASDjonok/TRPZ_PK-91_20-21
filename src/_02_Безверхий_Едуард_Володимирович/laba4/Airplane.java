package _02_Безверхий_Едуард_Володимирович.laba4;

import java.util.Calendar;
import java.util.Comparator;

public class Airplane implements Comparable<Airplane>{
    private String color;
    private int mass;
    private String title;
    private int power;
    private Calendar calendar;

    public Airplane(String color,int mass,String title,int power,Calendar calendar){
        this.color = color;
        this.mass = mass;
        this.title = title;
        this.power = power;
        this.calendar  = calendar;
    }

    public String getColor() {
        return color;
    }

    public int getMass() {
        return mass;
    }

    public String getTitle() {
        return title;
    }

    public int getPower() {
        return power;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public static Comparator<Airplane> MassComparator = new Comparator<Airplane>() {

        @Override
        public int compare(Airplane e1, Airplane e2) {
            return e1.getMass() - e2.getMass();
        }
    };



    public static Comparator<Airplane> calendarComparator = new Comparator<Airplane>() {

        @Override
        public int compare(Airplane e1, Airplane e2) {
            return e1.getCalendar().compareTo(e2.getCalendar());
        }
    };

    @Override
    public String toString() {
        return "\n" + "Цвет: " + this.color + ",\tМасса : "+ this.mass+",\tНазвание : "+this.title+",\tмощность = "+this.power+",\tдата создания = "+this.calendar.getTime();
    }

    @Override
    public int compareTo(Airplane o) {
        return 0;
    }
}
