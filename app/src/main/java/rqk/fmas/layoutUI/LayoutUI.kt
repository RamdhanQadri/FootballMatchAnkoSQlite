package rqk.fmas.layoutUI

import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import org.jetbrains.anko.*
import rqk.fmas.R

class LayoutUI : AnkoComponent<ViewGroup> {
    override fun createView(ui: AnkoContext<ViewGroup>): View {
        return with(ui) {
            linearLayout {
                lparams(matchParent, wrapContent)
                orientation = LinearLayout.VERTICAL

                linearLayout {
                    backgroundColor = Color.GRAY
                    orientation = LinearLayout.VERTICAL
                    padding = dip(10)

                    textView {
                        id = Id.textViewDate
                        textSize = 14f
                        gravity = Gravity.CENTER
                        textColorResource = android.R.color.black
                    }.lparams(matchParent, wrapContent)

                    linearLayout {
                        padding = dip(3)
                        orientation = LinearLayout.HORIZONTAL
                        gravity = Gravity.CENTER
                        weightSum = 3F

                        linearLayout {
                            gravity = Gravity.CENTER

                            textView {
                                id = Id.textViewHomeTeam
                                textSize = 16f
                                textColorResource = android.R.color.black
                                gravity = Gravity.CENTER
                            }.lparams(width = dip(80), height = wrapContent)
                        }.lparams {
                            topMargin = dip(5)
                            weight = 1F
                        }

                        linearLayout {

                            linearLayout {
                                gravity = Gravity.CENTER

                                textView {
                                    id = Id.testViewHomeScore
                                    textSize = 16f
                                    textColorResource = android.R.color.black
                                }
                            }.lparams {
                                topMargin = dip(5)
                                weight = 0.1F
                            }

                            linearLayout {
                                gravity = Gravity.CENTER

                                textView {
                                    textResource = R.string.match
                                    textSize = 16f
                                }
                            }.lparams {
                                topMargin = dip(5)
                                weight = 0.1F
                            }

                            linearLayout {
                                gravity = Gravity.CENTER

                                textView {
                                    id = Id.textViewAwayScore
                                    textSize = 16f
                                    textColorResource = android.R.color.black
                                }
                            }.lparams {
                                topMargin = dip(5)
                                weight = 0.1F
                            }
                        }.lparams {
                            topMargin = dip(5)
                            weight = 1F
                        }

                        linearLayout {
                            gravity = Gravity.RIGHT

                            textView {
                                id = Id.textViewAwayTeam
                                textSize = 16f
                                textColorResource = android.R.color.black
                            }.lparams(width = dip(80), height = wrapContent)
                        }.lparams {
                            topMargin = dip(5)
                            weight = 1F
                        }
                    }.lparams(matchParent, matchParent)
                }.lparams(matchParent, matchParent) {
                    setMargins(dip(16), dip(8), dip(16), dip(8))
                }
            }

        }

    }

    companion object Id {
        val textViewDate = 1
        val textViewHomeTeam = 2
        val testViewHomeScore = 3
        val textViewAwayScore = 4
        val textViewAwayTeam = 5
    }
}