package com.koshin.klsconfig.client;

import net.blay09.mods.balm.client.BalmClientRegistrars;

public class KlsConfigClient {

    public static void initialize(BalmClientRegistrars registrars) {
        ModKeyMappings.initialize();
    }

}
