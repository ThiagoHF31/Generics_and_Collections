import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Baralho extends LinkedList<Carta> {
    private String tema;

    public Baralho(String tema) {
        this.setTema(tema);
    }

    public void carregar() {
        switch (tema) {
            case "Dinossauros":
                this.add(new Carta("Tiradurex", "A1"));
                this.add(new Carta("Velocilento", "A2"));
                this.add(new Carta("Tricequadro", "A3"));
                this.add(new Carta("Apatossauros", "A4"));
                this.add(new Carta("Estegossauros", "A5"));
                this.add(new Carta("Branchissauro", "A6"));
                this.add(new Carta("Camgussauro", "A7"));
                this.add(new Carta("Bubassauro", "A8"));
            break;
            case "Naruto":
                this.add(new Carta("Naruto", "B1"));
                this.add(new Carta("Sasuke", "B2"));
                this.add(new Carta("Itachi", "B3"));
                this.add(new Carta("Kakashi", "B4"));
                this.add(new Carta("Rock lee", "B5"));
                this.add(new Carta("Minato", "B6"));
                this.add(new Carta("Gaara", "B7"));
                this.add(new Carta("Sakura", "B8"));
        }
    }

    public void embaralhar(){
        Collections.shuffle(this);
    }


    public void distribuir(Jogador[] jogadores){
        int jogador = 0;

        Iterator<Carta> iterador = this.iterator();

        while(iterador.hasNext()){
            if(jogadores[jogador].getMonte() == null)
            jogadores[jogador].setMonte(new Baralho(this.tema));
            jogadores[jogador].getMonte().add(iterador.next());
            iterador.remove();
            jogador = (jogador + 1) % jogadores.length;

        }
    }

    public Carta pegarDoTopo(){
        if ( this.peekLast() != null){
            return this.poll();
        } else{
        System.out.println("O monte não tem mais cartas!");
        return null;
        }
    }

    public void listarCartas(){
        System.out.println(this);
    }



    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }   
}
