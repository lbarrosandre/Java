package ultraemojicombat;
public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Pretty Boy", "França", 31, 11, 2, 1, 1.75f, 68.9f);
        l[1] = new Lutador("Putscript", "Brasil", 29, 14, 2, 3, 1.68f, 57.8f);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 12, 2, 1, 1.65f, 80.9f);
        l[3] = new Lutador("Dead Code", "Australia", 28, 13, 0, 2, 1.93f, 81.6f);
        l[4] = new Lutador("Cobol", "Brasil", 37, 5, 4, 3, 1.70f, 119.3f);
        l[5] = new Lutador("Nerdart", "EUA", 30, 12, 2, 4, 1.81f, 105.7f);
        
        
        l[5].status();
        l[5].apresentar();
    }
    
}
