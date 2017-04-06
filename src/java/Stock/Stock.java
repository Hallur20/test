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
        altt.add(new FTræogTagplader("25x200 mm. trykimp. Brædt",360,4,"Stk","understernbrædder til for & bag ende"));
        altt.add(new FTræogTagplader("25x200 mm. trykimp. Brædt",540,4,"Stk","understernbrædder til siderne"));
        altt.add(new FTræogTagplader("25x125 mm. trykimp. Brædt",360,2,"Stk","oversternbrædder til forenden"));
        altt.add(new FTræogTagplader("25x125 mm. trykimp. Brædt",540,4,"Stk","oversternbrædder til siderne"));
        altt.add(new FTræogTagplader("38x73 mm. Lægte ubh.",420,1,"Stk","til z på bagside af dør"));
        
        albsf.add(new FBeslagogSkruer("plastmo bundskruer 200 stk.",3,"pakke","Skruer til tagplader"));
        albsf.add(new FBeslagogSkruer("hulbånd 1x20 mm. 10 mtr.",2,"Rulle","Til vindkryds på spær"));
        albsf.add(new FBeslagogSkruer("universal 190 mm højre",15,"Stk","Til montering af spær på rem"));
        albsf.add(new FBeslagogSkruer("universal 190 mm venstre",15,"Stk","Til montering af spær på rem"));
        albsf.add(new FBeslagogSkruer("4,5 x 60 mm. skruer 200 stk.",1,"Pakke","Til montering af stern & vandbrædt"));
        
        alt.add(new TTræ("25x150 mm. trykimp. Bræt", 480, 2, "Stk", "Vindskeder på rejsning "));
        alt.add(new TTræ("25x150 mm. trykimp. Bræt", 600, 2, "Stk", "Sternbrædder til siderne Carport del"));
        alt.add(new TTræ("25x150 mm. trykimp. Bræt", 540, 1, "Stk", "Sternbrædder til siderne Skur del (deles)"));
        alt.add(new TTræ("25x150 mm. trykimp. Bræt", 0, 1, "Stk", "byg-selv spær (skal samles) 8 stk."));
        alt.add(new TTræ("97x97 mm. trykimp. Stolpe", 300, 9, "sæt", "Stolper nedgraves 90 cm. i jord + skråstiver"));
        
        altp.add(new TTagpakken("B & C Dobbelt -s sort ",300,"Stk","monteres på taglægter 6 rækker af 24 sten på hver side af taget"));
        altp.add(new TTagpakken("B & C Rygsten sort ",21,"Stk","monteres på toplægte med medfølgende beslag se tagstens vejledning"));
        altp.add(new TTagpakken("B & C Toplægte holder",8,"Stk","monteres på toppen af spæret (til toplægte)"));
        altp.add(new TTagpakken("B & C rygstensbeslag",21,"Stk","Til montering af rygsten"));
        altp.add(new TTagpakken("B & C tagstens bindere & nakkekroge",2,"Stk","til montering af tagsten, alle ydersten + hver anden fastgøres"));
        
        albst.add(new TBeslagogSkruer("universal 190 mm højre",8,"Stk", "Til montering af spær på rem"));
        albst.add(new TBeslagogSkruer("universal 190 mm venstre",8,"Stk", "Til montering af spær på rem"));
        albst.add(new TBeslagogSkruer("Stalddørsgreb 50x75",1,"sæt", "til dør i skur"));
        albst.add(new TBeslagogSkruer("T-hængsel 390 mm.",2,"Stk", "til dør i skur"));
        albst.add(new TBeslagogSkruer("vinkelbeslag",20,"Stk", "til montering af løsholter"));
    }
}
