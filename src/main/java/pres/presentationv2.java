package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Scanner;

public class presentationv2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("config.txt"));
        String daoclassname = sc.nextLine();

        // Chargement dynamique de la classe via constructeur
        Class cdao =Class.forName(daoclassname);
        //Si tu veux instancier un objet de cette classe, tu peux utiliser :
        //Object object = cdao.newInstance();
        IDao dao = (IDao) cdao.getConstructor().newInstance();
        //System.out.println(dao.getData());

        String metierclassname = sc.nextLine();
        Class cmetier= Class.forName(metierclassname);
        IMetier metier = (IMetier)cmetier.getConstructor().newInstance();

        //une autre méthode pour faire le metier.setDao(dao)
        //Chargement dynamique de la classe via setter
        Method setDao =cmetier.getDeclaredMethod("setDao", IDao.class);
        setDao.invoke(metier,dao);

        System.out.println("RES = "+metier.calcul());

    }
}
