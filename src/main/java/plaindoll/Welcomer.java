package plaindoll;

import java.util.Random;

public class Welcomer {
    public String sayWelcome() {
        return "Welcome home, good hunter. What is it your desire?";
    }

    public String sayFarewell() {
        return "Farewell, good hunter. May you find your worth in waking world.";
    }

    public String sayNeedGold() {
        return "Not enough gold";
    }

    public String saySome() {
        return "something in the way";
    }
    
    public String sayRandomHunterQuote() {
        String[] quotes = {
            "Every hunter must learn about the life hunt.",
            "The hunter's path is littered with sacrifices.",
            "The hunter find solace in the moonlit night.",
            "Even the best hunter must sharpen their blade.",
            "What awaits a true hunter in the depths of the night?"
        };

        Random random = new Random();
        int index = random.nextInt(quotes.length);
        return quotes[index];
    }
}