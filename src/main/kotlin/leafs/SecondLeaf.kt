package leafs

import Script
import org.powbot.api.rt4.Inventory
import org.powbot.api.script.tree.Leaf
import org.powbot.mobile.script.Logger

class SecondLeaf(script: Script) : Leaf<Script>(script, "Firstleaf") {
    override fun execute() {
        //TODO

        println("TEST")
    }
}