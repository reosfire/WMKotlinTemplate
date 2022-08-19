package ru.reosfire.template

import org.bukkit.plugin.java.JavaPlugin
import ru.reosfire.template.configuration.Config
import ru.reosfire.wmlib.extensions.loadConfig

class Startup : JavaPlugin() {
    lateinit var configuration : Config
        private set

    override fun onEnable() {
        configuration = loadConfig(::Config)
    }
}