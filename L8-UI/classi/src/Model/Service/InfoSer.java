package Model.Service;
import Model.Entity.*;
import Model.Repository.*;
import java.util.List;

public class InfoSer {
    private InfoSer () {
    }

    private static InfoSer infoServ = new InfoSer ();
    public void save (InfoEntityBuilder infoEntyBuilder) throws Exception {
        try (InfoRepo inforepo = new InfoRepo ()) {
            infoEntyBuilder.setName(infoEntyBuilder.getName());
            infoEntyBuilder.setUsername(infoEntyBuilder.getUsername());
            infoEntyBuilder.setPassword(infoEntyBuilder.getPassword());
            infoEntyBuilder.setEmail(infoEntyBuilder.getEmail());
            inforepo.insert (infoEntyBuilder);
            inforepo.commit ();
        }
    }
    public void edit (InfoEntityBuilder infoEntyBuilder) throws Exception{
        try (InfoRepo infoRepo=new InfoRepo ()){
            infoEntyBuilder.setUsername ("belfi13");
            infoEntyBuilder.setPassword("138181");
            infoRepo.update (infoEntyBuilder);
            infoRepo.commit ();
        }
    }

    public static InfoSer getInstance () {
        return infoServ;
    }

    public void remove(String email) throws Exception{
        try (InfoRepo personRepo=new InfoRepo ()){
            personRepo.delete (email);
            personRepo.commit ();
        }
    }
    public List<InfoEntityBuilder> report() throws Exception{
        List<InfoEntityBuilder> personEntis;
        try (InfoRepo infoRepo=new InfoRepo ()){
            personEntis=infoRepo.select ();
        }
        return personEntis;
    }
}
