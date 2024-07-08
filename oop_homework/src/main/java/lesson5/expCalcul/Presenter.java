package lesson5.expCalcul;

public class Presenter <T extends Model>{

    Voiw voiw;
    Model model;

    public Presenter(Model m,Voiw v){
        this.voiw = v;
        this.model = m;
    }

    public void buttonCli(){
        int a = voiw.getValue("a ");
        int b = voiw.getValue("b ");
        model.setX(a);
        model.setY(b);
        int res = model.resalt();
        voiw.print(res,"Sum ");

    }


}
