package com.Meelock.CrystallizedCrops.Proxy;


import com.Meelock.CrystallizedCrops.Render.CCRenderers;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        // Typically initialization of models and such goes here:
        CCRenderers.preInit();
    }
}
