package example.grails3311

class AnswerController {
    def index() { }

    def doSomething() {
        flash.message = message(code: "question.mymessage", default: "Job done")
        redirect(controller: "home")
    }
}
