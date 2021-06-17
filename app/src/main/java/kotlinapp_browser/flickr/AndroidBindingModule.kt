package kotlinapp_browser.flickr

import dagger.Module
import dagger.android.ContributesAndroidInjector
import kotlinapp_browser.flickr.photodetails.PhotoDetailsFragment
import kotlinapp_browser.flickr.recent.RecentPhotosFragment

@Module
abstract class AndroidBindingModule {
  @ContributesAndroidInjector
  abstract fun getRecentPhotosFragment(): RecentPhotosFragment

  @ContributesAndroidInjector
  abstract fun getPhotoDetailsFragment(): PhotoDetailsFragment
}
