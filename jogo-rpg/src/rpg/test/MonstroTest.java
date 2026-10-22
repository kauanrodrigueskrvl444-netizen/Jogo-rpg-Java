package rpg.test;

import rpg.dominio.Monstro;

public class MonstroTest {
    static void main() {
        Monstro goblin = new Monstro();
        Monstro esqueleto = new Monstro();
        Monstro guardiaoSombrio = new Monstro();

        //Goblin — 30 de vida, 6 de ataque e 1 de defesa.
        //Esqueleto — 45 de vida, 9 de ataque e 2 de defesa.
        //Guardião Sombrio — 75 de vida, 12 de ataque e 3 de defesa.

        goblin.nome = "Goblin";
        goblin.vida = 30;
        goblin.ataque = 6;
        goblin.defesa = 1;

        esqueleto.nome = "Esqueleto";
        esqueleto.vida = 45;
        esqueleto.ataque = 9;
        esqueleto.defesa = 2;

        guardiaoSombrio.nome = "Guardião Sombrio";
        guardiaoSombrio.vida = 75;
        guardiaoSombrio.ataque = 12;
        guardiaoSombrio.defesa = 3;

        System.out.printf("""
                Monstro %s
                [Vida] - %d
                [Ataque] - %d
                [Defesa] - %d
                """, goblin.nome, goblin.vida, goblin.ataque, goblin.defesa);
        System.out.println("--------------");

        System.out.printf("""
                Monstro %s
                [Vida] - %d
                [Ataque] - %d
                [Defesa] - %d
                """, esqueleto.nome, esqueleto.vida,esqueleto.ataque,esqueleto.defesa);
        System.out.println("---------------");

        System.out.printf("""
                Monstro %s
                [Vida] - %d
                [Ataque] - %d
                [Defesa] - %d
                """, guardiaoSombrio.nome,guardiaoSombrio.vida, guardiaoSombrio.ataque,guardiaoSombrio.defesa);
    }
}
