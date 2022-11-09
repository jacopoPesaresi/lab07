package it.unibo.nestedenum;

import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;

/**
 * Implementation of {@link MonthSorter}.
 */




public final class MonthSorterNested implements MonthSorter {

    enum Month{
        JANUARY(31),
        FEBRUARY(28),
        MARCH(31),
        APRIL(30),
        MAY(31),
        JUNE(30),
        JULY(31),
        AUGUST(31),
        SEPTEMBER(30),
        OCTOBER(31),
        NOVEMBER(30),
        DECEMBER(31);
    
        private int days;
    
        private Month(final int days){
            this.days = days;
        }
        
        int getDay(){
            return this.days;
        }
        
        public static Month fromString(String month){
            int counter = 0;
            Month tmp = null;
            /*Month tmp = Month.valueOf(month);
            if(tmp!=null) return tmp;*/
            for(final Month elem : Month.values()){
                if (elem.name().toLowerCase().contains(month.toLowerCase())){
                    counter++;
                    tmp=elem;
                }             
            }
            if(counter!=1 || tmp == null){
                System.out.println(month);
                throw new IllegalArgumentException();
            }
            return tmp;
        } 
    }


    @Override
    public Comparator<String> sortByDays() {
        // TODO Auto-generated method stub
        return new SortByDays();
    }

    @Override
    public Comparator<String> sortByOrder() {
        // TODO Auto-generated method stub
        return new SortByOrder();
    }


    /*
    @Override
    public Comparator<String> sortByDays() {
        return new Comparator<String>() {
           
        };
    }

    @Override
    public Comparator<String> sortByOrder() {
        return new Comparator<String>() {
            
        };
    }
*/
    private class SortByDays implements Comparator<String>{
        @Override
        public int compare(String arg0, String arg1) {
            Month m1 = Month.fromString(arg0);
            Month m2 = Month.fromString(arg1);
            //return m1.days-m2.days;
            // return Integer.compare(m1.days,m2.days);
            return m1.getDay() - m2.getDay();
        }
    }

    private class SortByOrder implements Comparator<String>{
        @Override
            public int compare(String arg0, String arg1) {
                Month m1 = Month.fromString(arg0);
                Month m2 = Month.fromString(arg1);
                // return Integer.compare(m1.ordinal(),m2.ordinal());
                return m1.ordinal() - m2.ordinal();
            }
            
    }

    
}
