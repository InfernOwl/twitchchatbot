
public class TwitchChatBot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// Start the bot up
		TwitchBot bot = new TwitchBot();
		
		// Enable debugging
		bot.setVerbose(true);
		
		// Connect to the IRC server
		bot.connect("irc.chat.twitch.tv", 6667, "oauth:gshy0f2egx4sa1szd2iced4wohnsbc");
		
		// Join the channel
		bot.joinChannel("#wasterbot");
		
		
	}

}
