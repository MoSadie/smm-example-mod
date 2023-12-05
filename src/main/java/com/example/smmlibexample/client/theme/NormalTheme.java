package com.example.smmlibexample.client.theme;

import com.example.smmlibexample.client.SMMLibExampleClient;
import com.mosadie.servermainmenu.api.MenuTheme;
import com.mosadie.servermainmenu.api.Util;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.random.Random;

public class NormalTheme implements MenuTheme {
    @Override
    public String getId() {
        return "normal";
    }

    @Override
    public Identifier getPanorama() {
        return new Identifier(SMMLibExampleClient.MOD_ID, "textures/gui/title/background/normal/panorama");
    }

    // As an easy-to-modify example, the following demonstrates how to use a static array of splash text
    // options and pick one randomly each time the splash text appears on screen.
    private final static String[] splashOptions = {
            "Hello there!",
            "You can change this!",
            "You can do it!",
            "I would love to hear about what you make!",
    };

    @Override
    public String getSplashText() {
        // Return a random line from the splashOptions array described above.
        // This is just one way to determine the splash text, be creative!
        return splashOptions[Random.create().nextBetweenExclusive(0, splashOptions.length)];
    }

    @Override
    public Text getQuickJoinButtonText() {
        // For hard-coded text, use Text.literal("whatever you want") instead
        // For demonstration purposes, here we use a translation key, for translation support.
        return Text.translatable("smm-lib-example.menu.join");
    }

    @Override
    public void onQuickJoinClicked() {
        // Called when the Quick Join button is clicked.
        // For this example we are using Util.joinServer,
        // but another use can be Util.loadWorld

        String name = "Your Server Name"; // Server name is usually used in mods for data storage.
        String address = "localhost"; // Server IP, just like when using direct connect.

        Util.joinServer(name, address);
    }

    @Override
    public boolean rollOdds() {
        // This is where the logic of "should this theme be picked" go.
        // For ease of use there are some functions in a Util class to help
        // such as Util.rollOddsFlipCoin(), which returns true half the time
        // and also Util.rollOddsMonthDay(month, day, daysBefore, daysAfter),
        //   which makes the theme appear more often as the day gets closer.
        // but you can use whatever logic you want!


        // This will always be picked, if the priority is highest, since we always return true.
        // This is recommended for single-theme mods or a default/fallback theme.
        return true;
    }

    @Override
    public int getPriority() {
        // The priority of themes, a theme with a lower priority will always lose if a higher priority theme's rollOdds returns true.
        // Larger number = higher priority.
        return 0;
    }

    @Override
    public boolean isSingleplayerVisible() {
        // Determines the visibility of the "Singleplayer" button on the Title Screen.
        return true;
    }

    @Override
    public boolean isMultiplayerVisible() {
        // Determines the visibility of the "Multiplayer" button on the Title Screen.
        return true;
    }

    @Override
    public boolean isQuickJoinVisible() {
        // Determines the visibility of the Quick Join button on the Title Screen.
        return true;
    }

    @Override
    public boolean isModsVisible() {
        // Determines the visibility of the "Mods" button on the Title Screen.
        return true;
    }
}
