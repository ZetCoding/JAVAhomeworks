package Model.Service;

import Model.Entity.Entity;
import Model.Repository.Repo;
import java.util.List;

public class Service {
    private Service(){}
    public static Service ser = new Service();
    public static Service getInstance () {
        return ser;
    }
    public void save (Entity entity) throws Exception {
        try (Repo rep = new Repo ()) {
            entity.setMyHajm (entity.getHajm () + (entity.getMyHajm()));
            rep.insert (entity);
            rep.commit ();
        }
    }
    public List<Entity> report() throws Exception{
        List<Entity> enti;
        try (Repo rep=new Repo ()){
            enti=rep.select ();
        }
        return enti;
    }


}
