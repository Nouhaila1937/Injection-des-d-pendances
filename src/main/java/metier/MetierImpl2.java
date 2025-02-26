package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component ("metier2")
public class MetierImpl2 implements IMetier {

    @Autowired // il n'est pas recommandé spring au démarrage va instancier l'object on utilisant le constructeur sans paramètre et puis va accéder à dao2 et lui affecter une valeur
            //autowired = injection
    private IDao dao2;

    public void setDao2(IDao dao2) {
        this.dao2 = dao2;
    }

    public MetierImpl2(IDao dao2) {
        this.dao2 = dao2;
    }

    @Override
    public double calcul() {
        double data = dao2.getData();
        return data * 2;
    }
}
