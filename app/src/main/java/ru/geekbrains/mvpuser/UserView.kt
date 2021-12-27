package ru.geekbrains.mvpuser

import moxy.MvpView
import moxy.viewstate.strategy.alias.SingleState
import ru.geekbrains.data.GitHubUser

interface UserView : MvpView {

    @SingleState
    fun showPhoto(url: String)

    @SingleState
    fun showName(name: String)

}