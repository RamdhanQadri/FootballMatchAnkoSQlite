package rqk.fmas.interfac

import rqk.fmas.model.Event

interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showMatch(data: List<Event>)
    fun showTeam(data: List<Event>, homeTeam: Boolean)
}