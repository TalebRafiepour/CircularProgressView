package antonkozyriatskyi.circularprogressindicator

/**
 * Created by Anton on 06.06.2018.
 */

class DefaultProgressTextAdapter : CircularProgressIndicator.ProgressTextAdapter {

    override fun formatText(currentProgress: Double): String {
        return currentProgress.toInt().toString()
    }
}
