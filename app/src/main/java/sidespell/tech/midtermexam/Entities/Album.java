package sidespell.tech.midtermexam.Entities;

/**
 * Created by junvir on 2/2/2016.
 */
public class Album {

    public Album(String mMusic, String mGenre, int mImageId) {
        this.mMusic = mMusic;
        this.mGenre = mGenre;
        this.mImageId = mImageId;
    }

    private String mMusic;
    private String mGenre;
    private int    mImageId;

    public void setmMusic(String mMusic) {
        this.mMusic = mMusic;
    }

    public void setmGenre(String mGenre) {
        this.mGenre = mGenre;
    }

    public void setmImageId(int mImageId) {
        this.mImageId = mImageId;
    }

    public String getmMusic() {

        return mMusic;
    }

    public String getmGenre() {
        return mGenre;
    }

    public int getmImageId() {
        return mImageId;
    }
}
