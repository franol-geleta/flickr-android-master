package kotlinapp_browser.flickr

import java.util.*

data class Photo(
    val id: String = UUID.randomUUID().toString(),
    val link: String,
    val title: String? = null
)
