package mods.natura.common;

import java.io.File;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class NProxyCommon
{
    public void registerRenderer ()
    {

    }

    public void addNames ()
    {
        LanguageRegistry.instance().addStringLocalization("entity.Natura.Imp.name", "en_US", "Imp");
        LanguageRegistry.instance().addStringLocalization("entity.Natura.FlameSpider.name", "en_US", "Heatscar Spider");
        LanguageRegistry.instance().addStringLocalization("entity.Natura.NitroCreeper.name", "en_US", "Nitro Creeper");
        LanguageRegistry.instance().addStringLocalization("entity.Natura.FlameSpiderBaby.name", "en_US", "Baby Heatscar Spider");

    }

}
