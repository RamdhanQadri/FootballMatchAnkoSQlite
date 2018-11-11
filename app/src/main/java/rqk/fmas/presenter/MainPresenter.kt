package rqk.fmas.presenter

import com.google.gson.Gson
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import rqk.fmas.api.ApiRepository
import rqk.fmas.api.TheSportDBApi
import rqk.fmas.interfac.MainView
import rqk.fmas.model.EventResponse
import rqk.fmas.model.TeamsResponse

class MainPresenter(
    private val view: MainView,
    private val apiRepository: ApiRepository,
    private val gson: Gson
) {
    fun getLastEvents(leagueId: Int?) {
        view.showLoading()
        doAsync {
            val data = gson.fromJson(
                apiRepository
                    .doRequest(TheSportDBApi.getLastEvents(leagueId)),
                EventResponse::class.java
            )

            uiThread {
                view.hideLoading()
                view.showMatch(data.events)
            }
        }
    }

    fun getNextEvents(leagueId: Int?) {
        view.showLoading()
        doAsync {
            val data = gson.fromJson(
                apiRepository
                    .doRequest(TheSportDBApi.getNextEvents(leagueId)),
                EventResponse::class.java
            )

            uiThread {
                view.hideLoading()
                view.showMatch(data.events)
            }
        }
    }

    fun getDetailEvents(eventId: String) {
        view.showLoading()
        doAsync {
            val data = gson.fromJson(
                apiRepository
                    .doRequest(TheSportDBApi.getDetailEvent(eventId)),
                EventResponse::class.java
            )

            uiThread {
                view.hideLoading()
                view.showMatch(data.events)
            }
        }
    }

    fun getDetailTeams(teamId: String, homeTeam: Boolean = true) {
        view.showLoading()
        doAsync {
            val data = gson.fromJson(
                apiRepository
                    .doRequest(TheSportDBApi.getDetailTeam(teamId)),
                TeamsResponse::class.java
            )

            uiThread {
                view.hideLoading()
                view.showTeam(data.teams, homeTeam)
            }
        }
    }
}