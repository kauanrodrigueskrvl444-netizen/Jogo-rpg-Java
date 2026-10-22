package rpg.test;

import rpg.dominio.Heroi;

public class HeroiTest01 {
    static void main() {
        Heroi arthur = new Heroi();
        Heroi luna = new Heroi();

        //Arthur — 100 de vida, 15 de ataque e 5 de defesa.
        //Luna — 80 de vida, 20 de ataque e 3 de defesa.

        arthur.nome = "Arthur";
        arthur.vida = 100;
        arthur.ataque = 15;
        arthur.defesa = 5;

        luna.nome = "Luna";
        luna.vida = 80;
        luna.ataque = 20;
        luna.defesa = 3;

        System.out.printf("""
                Heroi %s
                [vida] - %d
                [ataque] - %d
                [defesa] - %d
                """, arthur.nome,arthur.vida,arthur.ataque,arthur.defesa);
        System.out.println("--------------");

        System.out.printf("""
                Heroi %s
                [Vida] - %d
                [ataque] - %d
                [defesa] - %d
                """, luna.nome, luna.vida,luna.ataque,luna.defesa);

    }
}
