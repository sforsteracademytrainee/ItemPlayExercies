package controllers

import javax.inject._
import play.api.mvc._
import services.Words


@Singleton
class MyController @Inject()(cc: ControllerComponents) extends AbstractController(cc)  {

    def sendIt = Action {
        Ok(views.html.day1("no monkey buisness", ""))
    }

    def talkToMe(number: Int) = Action {
        println(Words.doWords(number))
        Ok(views.html.day1("MONKEY BUISNESS", Words.doWords(number)))
    }

    def myFunction = ???
}
