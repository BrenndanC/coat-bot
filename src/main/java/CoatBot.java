import events.*;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import javax.security.auth.login.LoginException;

public class CoatBot {
    public static void main(String[] args) throws LoginException {
        final String TOKEN = "MTEwNzA3MTQ5NTg1Mjc5Mzg2Nw.G67lm9.Jm_5Gd16M_ueVxLfxt73eL_WS5ab5EKbWlb7Fw";
        JDABuilder jdaBuilder = JDABuilder.createDefault(TOKEN);
        JDA jda = jdaBuilder
                .enableIntents(GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MESSAGES)
                .addEventListeners(new ReadyEventListener(), new MessageEventListener(), new InteractionEventListener())
                .setActivity(Activity.playing("League of Legends"))
                .build();
    }
}
