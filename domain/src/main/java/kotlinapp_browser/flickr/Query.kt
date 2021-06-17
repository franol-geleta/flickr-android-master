package kotlinapp_browser.flickr

sealed class Query

object Recent : Query()

data class Search(val queryText: String) : Query()