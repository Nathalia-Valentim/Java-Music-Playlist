import java.util.ArrayList;
public class Playlist {
    public static void main(String[] args) {
        ArrayList<String> listaParaIlhaDeserta = new ArrayList<String>();
        listaParaIlhaDeserta.add("Pandora");
        listaParaIlhaDeserta.add("Poesia Acústica 11: Nada Mudou");
        listaParaIlhaDeserta.add("Felina");
        listaParaIlhaDeserta.add("Dusk Till Dawn");
        listaParaIlhaDeserta.add("Sorry Not Sorry");
        listaParaIlhaDeserta.add("Walls Could Talk");
        listaParaIlhaDeserta.add("Bitch Better Have My Money");
        listaParaIlhaDeserta.add("Rihanna");
        System.out.println(listaParaIlhaDeserta);

        System.out.println(listaParaIlhaDeserta.size());

        listaParaIlhaDeserta.remove("Pandora");
        listaParaIlhaDeserta.remove("Sorry Not Sorry");
        listaParaIlhaDeserta.remove("Rihanna");
        System.out.println(listaParaIlhaDeserta);     
        System.out.println(listaParaIlhaDeserta.size());           
    }
}