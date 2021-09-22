package pl.oucik.welcomer;
import net.md_5.bungee.api.ChatColor;
public class ChatHelper {
    public static String color(String s) {
        return ChatColor.translateAlternateColorCodes('&', s)
                .replace(">>", "\u00BB")
                .replace("<<", "\u00AB");
    }
}
