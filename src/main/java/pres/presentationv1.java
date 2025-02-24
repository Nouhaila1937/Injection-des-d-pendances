package pres;

import dao.DaoImpl;
import ext.DaoImplV2;
import metier.MetierImpl;

public class presentationv1 {
    public static void main(String[] args) {
       // injection des dependances par instanciation statique (on utilisant new injection via setter)
        DaoImpl dao = new DaoImpl();
        DaoImplV2 dao2 = new DaoImplV2();
        // MetierImpl metier = new MetierImpl();

 /*************************************************************************/

        //injection des dependances via le constructeur
        MetierImpl metier = new MetierImpl(dao);
        //metier.setDao(dao);
        System.out.println("RES= "+metier.calcul());

    }
}
