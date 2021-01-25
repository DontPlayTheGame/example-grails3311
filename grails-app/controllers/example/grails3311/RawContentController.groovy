package example.grails3311

class RawContentController {

    def index() {
        def content = "<em>sample with included</em> content"
        render(view: "index", model: [content: content])
    }
}
