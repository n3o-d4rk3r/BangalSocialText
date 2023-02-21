package bd.com.bangal.socialviewcommons;

import androidx.annotation.NonNull;

/**
 * Abstract hashtag to be used with {@link bd.com.bangal.socialviewcommons.HashtagArrayAdapter}.
 */
public interface Hashtagable {
  /** Unique id of this hashtag. */
  @NonNull
  CharSequence getId();

  /** Optional count, located right to hashtag name. */
  int getCount();
}
