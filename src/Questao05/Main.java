package Questao05;

public class Main {
    public static void main(String[] args){
        Personagem personagem1 = new Guerreiro();
        Personagem personagem2 = new Mago();
        Personagem personagem3 = new Arqueiro();

        personagem1.atacar();
        personagem2.atacar();
        personagem3.atacar();

    }
}
