package AlbumAdapter;

/**
 * Created by junvir on 2/2/2016.
 */
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import Entities.Album;

import Constants.Constant;
import sidespell.tech.midtermexam.R;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MovieViewHolder> {

    private Context     mContext;
    private int         mLayoutId;
    private List<Album> mMusic;

    public RecyclerViewAdapter(Context context, int layoutId, List<Album> music) {
        mContext = context;
        mLayoutId = layoutId;
        mMusic = music;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(mLayoutId, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        Album music = mMusic.get(position);

        if (music != null) {
            if (holder.imgMovie != null) {
                holder.imgMovie.setImageResource(music.getmImageId());
            }
            if (holder.tvName != null) {
                holder.tvName.setText(music.getmMusic());
            }
            if (holder.tvGenre != null) {
                holder.tvGenre.setText(music.getmGenre());
            }
        }
    }

    @Override
    public int getItemCount() {
        return mMusic.size();
    }

    static class MovieViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public CardView  cardView;
        public ImageView imgMovie;
        public TextView  tvName;
        public TextView  tvGenre;

        public MovieViewHolder(View view) {
            super(view);
            cardView = (CardView) view.findViewById(R.id.cardView);
            imgMovie = (ImageView) view.findViewById(R.id.imgMovie);
            tvName = (TextView) view.findViewById(R.id.tvName);
            tvGenre = (TextView) view.findViewById(R.id.tvGenre);

            // once an item view (list item or grid item) is clicked
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
