package com.Imphuls3.createcafe.compat;

import com.Imphuls3.createcafe.common.item.ModCreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.ModList;

public class Compat {
    public static boolean FRUITTREESLOADED;
    public static boolean CROPTOPIALOADED;
    public static boolean PH2TREESLOADED;
    public static boolean PH2CROPSSLOADED;
    public static boolean POWDERRELOADED;
    public static boolean BLOODMAGICLOADED;
    public static boolean BOTANIALOADED;
    public static boolean BYGLOADED;
    public static boolean BOPLOADED;

    public static void init() {
        FRUITTREESLOADED = ModList.get().isLoaded("fruittrees");
        CROPTOPIALOADED = ModList.get().isLoaded("croptopia");
        PH2TREESLOADED = ModList.get().isLoaded("pamhc2trees");
        PH2CROPSSLOADED = ModList.get().isLoaded("pamhc2crops");
        POWDERRELOADED = ModList.get().isLoaded("powder_and_more_remastered");
        BLOODMAGICLOADED = ModList.get().isLoaded("bloodmagic");
        BOTANIALOADED = ModList.get().isLoaded("botania");
        BYGLOADED = ModList.get().isLoaded("byg");
        BOPLOADED = ModList.get().isLoaded("biomesoplenty");
    }

    public static class Loaded {
        public static Item.Properties makeDrink() {
            return new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE);
        }
    }
}
