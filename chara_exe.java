import java.util.Scanner;
public class chara_exe
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("INITIALIZING ProgramC.EXE...");
        System.out.println("LOADING...");
        System.out.println("LOADING COMPLETE. PLEASE ENTER A COMMAND. ALL COMMANDS ARE LOWERCASE.");
        String cmdIN = input.nextLine();
        
        if (cmdIN.equals("yuri"))
        {
            System.out.println("YURI :3 YURI :3 YURI :3 YURI :3 YURI :3 YURI :3 YURI :3 YURI :3 YURI :3 YURI :3 YURI :3 YURI :3 YURI :3 YURI :3 YURI :3 YURI :3 YURI :3 YURI :3");
        }
        else if (cmdIN.equals("yuri list"))
        {
            System.out.println("1. Bloom Into You; 2. I'm In Love With The Villainess; 3. Strawberry Panic; 4. Vexations of a Shut-in Vampire Princess; 5. Lycoris Recoil; 6. Kobayashi-san's Dragon Maid; 7. Urasekai Picinic; 8. Sakura Trick; 9. Mobile Suit Gundam: The Witch from Mercury");
        }
        else if (cmdIN.equals("silly"))
        {
            System.out.println("we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3 we silly :3");
        }
        else if (cmdIN.equals("deltarune"))
        {
            System.out.println("Once upon a time, a LEGEND was whispered among shadows.\nIt was a LEGEND of HOPE. It was a LEGEND of DREAMS.\nIt was a LEGEND of LIGHT. It was a LEGEND of DARK.\nThis is the legend of DELTA RUNE.\nFor millenia, LIGHT and DARK have lived in balance, bringing peace to the WORLD.\nBut if this harmony were to shatter… a terrible calamity would occur.\nThe sky will run black with terror, and the land will crack with fear.\nThen, her heart pounding… the EARTH will draw her final breath.\nOnly then, shining with hope… three HEROES appear at WORLDS' edge.\nA HUMAN, A MONSTER, and a PRINCE FROM THE DARK.\nOnly they can seal the fountains, and banish the ANGEL'S HEAVEN.\nOnly then will balance be restored, and the WORLD saved from destruction.\nToday, the FOUNTAIN OF DARKNESS - the geyser that gives this land form - stands tall at the center of the kingdom.\nBut recently, another fountain has appeared on the horizon…\nAnd with it, the balance of LIGHT and DARK begins to shift...");
        }
        else if (cmdIN.equals("revive underrune"))
        {
            System.out.println("UnderRune? Oh, you mean that crackpot Undertale x Deltarune AU thing that me and a friend worked on back in freshman year? yeah no i'm not gonna revive that. besides, it's already kinda finished.");
        }
        else if (cmdIN.equals("wildfire"))
        {
            System.out.println("Wrapped in biting wind, hearts will never bleed.\nFrozen and banished, out of grieeeef~.\nIn their restless dreams, they try so hard to breathe.\nPulses flutter and sting, within this bleakness (ah ah, ah ah)...\nPain will come with the blade. \nPain will wake up the despondant crowd in this dormant world somehowwww~.\nUnsheathe a sword not to kill; unsheathe a sword to rend those clouds above the ground; wake up, it's time to gather now~");
        }
        else if (cmdIN.equals("ai"))
        {
            System.out.println("AI is a tool, not a replacement. Especially for art.");
        }
        else if (cmdIN.equals("original characters"))
        {
            System.out.println("yes i indeed own an OC manufacturing company. why do you ask?");
        }
        else if (cmdIN.equals("fanfiction"))
        {
            System.out.println("yeah i do create them but they kinda suck lmao");
        }
        else if (cmdIN.equals("isekai underground"))
        {
            System.out.println("an Undertale AU in the works that isn't a crackpot");
        }
        else if (cmdIN.equals("lesbian polycule"))
        {
            System.out.println("here's a sneak- nah just kidding. maybe i'll give some character info if you ask :3");
        }
        else if (cmdIN.equals("polycule character info"))
        {
            System.out.println("Madeline: Flirty lesbian yandere\nEris: Self-critical lamia who is obsessed with girls\nAnri: eepy princess number 1 :3\nChara: eepy princess number 2 :3 (also a self insert but who cares)\nLily: lesbian vampire who kind of represents this group in the real world lol\nKorra: If Madeline and Eris somehow had a child (she is a self-critical girl obsessed lesbian)\nBronya: sleepy yandere princess :3");
        }
        else if (cmdIN.equals("interview"))
        {
            System.out.println("what is there to say? i'm just a sleepy, slightly sociopathic transbian disaster who likes to do internet things (who also probably has several mental illnesses and is neurodivergent)");
        }
        else if (cmdIN.equals("lesbianism"))
        {
            System.out.println("idk what to tell you. girls are simply the best.");
        }
        else if (cmdIN.equals("vocaloid synth list"))
        {
            System.out.println("TOP VOCALOIDS: \n1. Megurine Luka\n2. Kaai Yuki\n3. Kagamine Rin\n4. Kasane Teto\n5. v flower\n6. Hatsune Miku\n7. Gumi EN/JP\n8. KAFU \n9. Komurasaki Momoka\n10. Nijine Fuwa");
        }
        else
        {
            System.out.println("INVALID COMMAND. TRY AGAIN OR INPUT 'help' FOR COMMAND LIST.");
        }
    }
}