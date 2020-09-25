package me.lambdaurora.spruceui.test.gui;

import me.lambdaurora.spruceui.SpruceTabbedScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.LiteralText;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;

public class SpruceTabbedTestScreen extends SpruceTabbedScreen
{
    protected SpruceTabbedTestScreen(@Nullable Screen parent)
    {
        super(new LiteralText("Tabbed Screen Test"), Arrays.asList(new SpruceTextAreaScreen(parent)));
    }
}