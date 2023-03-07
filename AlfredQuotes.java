import java.util.Date;
import java.time.LocalTime;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String string1 = ". May I help you take your coat for the time being?";
        String string2 = name.concat(string1);
        return "Greetings " + string2;
    }
    
    public String guestGreeting(String name, LocalTime time) {
        return "Greetings " + name + ". It is now " + time.toString();
    }

    public String dateAnnouncement() {
        Date date = new Date(); 
        return "The current date is " + date;
    }
    
    public String respondBeforeAlexis(String phrase) {
        if(phrase.indexOf("Alexis") > -1) {
            return "If you think you know all the answers why even bother asking for *my* advice?"; 
        }

        if(phrase.indexOf("Alfred") > -1) {
            return "Well I did warn you.";
        }
        return "I don't even know anymore...";
    }

    public String yellingAtYou(String conversation) {
        String yelling = "Let's see how you survive being the Batman without me. I QUIT!";
        return yelling;
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

