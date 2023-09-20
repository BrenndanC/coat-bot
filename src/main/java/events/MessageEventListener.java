package events;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import java.util.concurrent.ThreadLocalRandom;

public class MessageEventListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        super.onMessageReceived(event);
        System.out.print(event.getAuthor().getName() + " in " + event.getChannel().getName() + " sent: " + event.getMessage().getContentDisplay());
//        System.out.println(event.getAuthor().getId());

        int respond = ThreadLocalRandom.current().nextInt(1, 101);
        int special = ThreadLocalRandom.current().nextInt(0, 2);
        int random;

        System.out.println(" " + respond);

        final String COATBOT = "1107071495852793867";
        final String p1ort = "279763513147129856";
        final String bread = "147519212334743566";
        final String alex = "214053868030394370";

        if (event.getMessage().toString().contains("@Coat")) {
            respond = ThreadLocalRandom.current().nextInt(1, 21);
            if (respond == 5) {
                event.getChannel().sendMessage("would u shut up already").queue();
            }
        }

        if (event.getMessage().toString().contains("shower") || event.getMessage().toString().contains("bath")) {
            respond = ThreadLocalRandom.current().nextInt(1, 6);
            if (respond == 5) {
                event.getChannel().sendMessage("without me? :smirk:").queue();
            }
        }

        if (respond > 124) {
            if ((event.getAuthor().getId().compareTo(p1ort) == 0) && (special == 0)) { // grant sent a message
                event.getChannel().sendMessage("shut up platty").queue();
            } else if ((event.getAuthor().getId().compareTo(alex) == 0) && (special == 0)) { // alex sent a message
                event.getChannel().sendMessage("can u help me with this code real quick").queue();
            } else if (event.getAuthor().getId().compareTo(COATBOT) != 0) { // do a random response
                random = ThreadLocalRandom.current().nextInt(1, 4);
                switch (random) {
                    case 1:
                        event.getChannel().sendMessage("who?").queue();
                        break;
                    case 2:
                        event.getChannel().sendMessage("heheh!").queue();
                        break;
                    case 3:
                        event.getChannel().sendMessage("when?").queue();
                        break;
                }
            }
        }
    }
}