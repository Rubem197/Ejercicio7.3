package principal;

import javax.swing.table.AbstractTableModel;

public class Main {

    public static void main(String[] args) {
        Motor t1,t2,t3,t4,t5;
        t1=Motor.AVION;
        t2=Motor.BARCO;
        t3=Motor.CAMION;
        t4=Motor.COCHE;
        t5=Motor.TREN;

        System.out.println("orden avion "+t1.ordinal());
        System.out.println("Orden barco "+t2.ordinal());
        System.out.println("Orden camion "+t3.ordinal());
        System.out.println("Orden coche "+t4.ordinal());
        System.out.println("Orden tren "+t5.ordinal());

        if (t1.compareTo(t2)>0)
        {
            System.out.println(t1+ " corre mas que " +t2);
        }
        if (t4.compareTo(t3)>0)
        {
            System.out.println(t4 + " corre mas que " + t3);
        }
        if (t5.compareTo(t5)==0)
        {
            System.out.println(t5 + " corre igual " + t5);
        }
    }
}
