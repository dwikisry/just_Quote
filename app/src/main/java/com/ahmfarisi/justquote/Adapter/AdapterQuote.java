package com.ahmfarisi.justquote.Adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ahmfarisi.justquote.R;

public class AdapterQuote {
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvText, tvAuthor;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvText = itemView.findViewById(R.id.tv_text);
            tvAuthor = itemView.findViewById(R.id.tv_author);
            
        }
    }
}
