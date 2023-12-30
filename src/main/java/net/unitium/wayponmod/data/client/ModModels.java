package net.unitium.wayponmod.data.client;

import net.minecraft.data.client.Model;
import net.minecraft.data.client.TextureKey;
import net.minecraft.util.Identifier;
import net.unitium.wayponmod.Waypon;

import java.util.Optional;

public class ModModels {


    public static final Model BIG_SWORD = item("big_sword", TextureKey.LAYER0);;
    public static final Model RAPIERE = item("rapiere", TextureKey.LAYER0);;
    public static final Model KATANA = item("katana", TextureKey.LAYER0);;



    private static Model item(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(new Identifier(Waypon.MOD_ID, "item/" + parent)), Optional.empty(), requiredTextureKeys);
    }

}
