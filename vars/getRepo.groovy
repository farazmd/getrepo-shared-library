def call(Map repo){
    def c = new dev.farazmd.Utils(this)
    return c.checkout(repo)
}

return this