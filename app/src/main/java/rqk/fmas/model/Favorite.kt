package rqk.fmas.model


data class Favorite(
    val id: Long?,
    val eventId: String?,
    val eventDate: String?,
    val homeTeam: String?,
    val homeTeamId: String?,
    val homeScore: String?,
    val awayTeam: String?,
    val awayTeamId: String?,
    val awayScore: String?
) {
    companion object {
        const val TABLE_FAVORITE: String = "TABLE_FAVORITE"
        const val ID: String = "ID_"
        const val EVENT_ID: String = "EVENT_ID"
        const val EVENT_DATE: String = "EVENT_DATE"
        const val HOME_TEAM_ID: String = "HOME_TEAM_ID"
        const val HOME_TEAM: String = "HOME_TEAM"
        const val HOME_TEAM_SCORE: String = "HOME_TEAM_SCORE"
        const val AWAY_TEAM_ID: String = "AWAY_TEAM_ID"
        const val AWAY_TEAM: String = "AWAY_TEAM"
        const val AWAY_TEAM_SCORE: String = "AWAY_TEAM_SCORE"
    }
}