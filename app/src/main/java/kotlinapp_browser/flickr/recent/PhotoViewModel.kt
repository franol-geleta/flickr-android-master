package kotlinapp_browser.flickr.recent

import android.net.Uri
import kotlinapp_browser.flickr.core.TapAction
import java.util.*

typealias PhotoId = String

data class PhotoViewModel(
    val id: PhotoId = UUID.randomUUID().toString(),
    val link: Uri,
    val title: String? = null
) {
  val tapAction: TapAction<PhotoViewModel> = TapAction.create { this }
}
