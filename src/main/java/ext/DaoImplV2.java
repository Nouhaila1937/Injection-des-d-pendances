package ext;

import dao.IDao;

public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println ("version web service") ;
        double temp= 23;
        return temp ;
    }
}
