package net.emteeware

import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class TraktShow {
        var title: String? = null
        var overview: String? = null
        lateinit var language: String
        lateinit var country: String
}
