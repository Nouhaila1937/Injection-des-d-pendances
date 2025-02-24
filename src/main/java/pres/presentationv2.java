package pres;

import dao.IDao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class presentationv2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("config.txt"));
        String daoclassname = sc.nextLine();

        // Chargement dynamique de la classe
        Class cdao =Class.forName(daoclassname);
        //Si tu veux instancier un objet de cette classe, tu peux utiliser :
        //Object object = cdao.newInstance();
        IDao dao = (IDao) cdao.newInstance();
        System.out.println(dao.getData());

    }
}
