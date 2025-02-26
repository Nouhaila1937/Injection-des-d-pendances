package metier;
import dao.IDao;
import org.springframework.stereotype.Component;

//@Component("metier")
public class MetierImpl implements IMetier {
    private IDao dao=null;

    // Setter pour l'injection de dépendance
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {}
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double data = dao.getData();
        return data * 2;
    }
}
