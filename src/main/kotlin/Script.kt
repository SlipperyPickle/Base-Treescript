import branch.FirstBranch
import org.powbot.api.script.ScriptCategory
import org.powbot.api.script.ScriptManifest
import org.powbot.api.script.paint.Paint
import org.powbot.api.script.paint.PaintBuilder
import org.powbot.api.script.tree.TreeComponent
import org.powbot.api.script.tree.TreeScript

@ScriptManifest(
    name = "LazScript",
    description = "Test script",
    version = "1.0.0",
    category = ScriptCategory.Other,
    author = "Lazarus"
)


class Script : TreeScript() {

    override val rootComponent: TreeComponent<*> by lazy {
        FirstBranch(this)
    }

    override fun onStart() {

        addPaint()
    }

    private fun addPaint() {
        val p: Paint = PaintBuilder.newBuilder()
            .addString("Last leaf:") {""} //{  .name }
            .y(45)
            .x(40)
            .build()
        addPaint(p)
    }

}

fun main(args: Array<String>) {
    Script().startScript()
}