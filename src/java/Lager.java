import java.util.ArrayList;
import java.util.List;

public class Lager {
    //Fladt tag
    ArrayList<FTræogTagplader> altt = new ArrayList<>();
    ArrayList<FBeslagogSkruer> albsf = new ArrayList<>();
    

    //Trekantet tag
    ArrayList<TTræ> alt = new ArrayList<>();
    ArrayList<TTagpakken> altp = new ArrayList<>();
    ArrayList<TBeslagogSkruer> albst = new ArrayList<>();
    
        public void alttData(){
        altt.add(new FTræogTagplader("hey",1,1,"test","test"));
        altt.add(new FTræogTagplader("hey",1,1,"test","test"));
        altt.add(new FTræogTagplader("hey",1,1,"test","test"));
        
        
        albsf.add(new FBeslagogSkruer("yo",2,"3x9","a tall screw"));
        albsf.add(new FBeslagogSkruer("yo",2,"3x9","a tall screw"));
        albsf.add(new FBeslagogSkruer("yo",2,"3x9","a tall screw"));
        
        alt.add(new TTræ("qwe", 1, 1, "qw", "qww"));
        alt.add(new TTræ("qwe", 1, 1, "qw", "qww"));
        alt.add(new TTræ("qwe", 1, 1, "qw", "qww"));
        
        altp.add(new TTagpakken("kk",2,"yy","xx"));
        altp.add(new TTagpakken("kk",2,"yy","xx"));
        altp.add(new TTagpakken("kk",2,"yy","xx"));
        
        albst.add(new TBeslagogSkruer("qwe",2,"qw", "sad"));
        albst.add(new TBeslagogSkruer("qwe",2,"qw", "sad"));
        albst.add(new TBeslagogSkruer("qwe",2,"qw", "sad"));
    }
}
