package events;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.concurrent.ThreadLocalRandom;

public class InteractionEventListener extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {
        super.onSlashCommandInteraction(event);
        int val;
        File file;
        switch (event.getName()) {
            case "bread":
                val = ThreadLocalRandom.current().nextInt(1, 6);
                switch(val) {
                    case 1:
                        file = new File("C:\\Users\\brenn\\OneDrive\\Desktop\\Bread\\bread1.png");
                        event.replyFile(file).queue();
                        break;
                    case 2:
                        file = new File("C:\\Users\\brenn\\OneDrive\\Desktop\\Bread\\bread2.png");
                        event.replyFile(file).queue();
                        break;
                    case 3:
                        file = new File("C:\\Users\\brenn\\OneDrive\\Desktop\\Bread\\bread3.png");
                        event.replyFile(file).queue();
                        break;
                    case 4:
                        file = new File("C:\\Users\\brenn\\OneDrive\\Desktop\\Bread\\bread4.png");
                        event.replyFile(file).queue();
                        break;
                    case 5:
                        file = new File("C:\\Users\\brenn\\OneDrive\\Desktop\\Bread\\bread5.png");
                        event.replyFile(file).queue();
                        break;
                }
                break;
            case "p1ort":
                event.reply("whell ackhtually... :nerd:").queue();
                break;
            case "coat":
                val = ThreadLocalRandom.current().nextInt(1, 5);
                switch (val) {
                    case 1:
                        event.reply("heheh! :neutral_face:").queue();
                        break;
                    case 2:
                        event.reply("without me??? :smirk:").queue();
                        break;
                    case 3:
                        event.reply("who?").queue();
                        break;
                    case 4:
                        event.reply("shut up platty").queue();
                        break;
                }
                break;
            case "arek":
                event.reply("put it in my mouf :eggplant: :sweat_drops:").queue();
                break;
        }
    }
}
