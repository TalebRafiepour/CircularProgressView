package antonkozyriatskyi.circularprogressindicator

/**
 * Created by Anton on 06.06.2018.
 */

class PatternProgressTextAdapter(private val pattern: String) : CircularProgressIndicator.ProgressTextAdapter {

    override fun formatText(currentProgress: Double): String {
        return String.format(pattern, currentProgress)
    }
}
