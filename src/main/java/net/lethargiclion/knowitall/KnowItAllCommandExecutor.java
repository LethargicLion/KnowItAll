package net.lethargiclion.knowitall;

/*
    This file is part of KnowItAll

    Foobar is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Foobar is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class KnowItAllCommandExecutor implements CommandExecutor {

    @SuppressWarnings("unused")
    private KnowItAll plugin;

    public KnowItAllCommandExecutor(KnowItAll plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Currently there are no commands in KnowItAll

        /*
        if (command.getName().equalsIgnoreCase("command")) {
            //do something
            return true;
        }*/
        
        return false;
    }
}
