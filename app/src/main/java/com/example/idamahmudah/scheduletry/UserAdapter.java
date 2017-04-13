package com.example.idamahmudah.scheduletry;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.idamahmudah.scheduletry.Model.DataModel;

import java.util.List;

/**
 * Created by lenovo on 05/04/2017.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserAdapterViewHolder> {

    private Activity context;
    private List<DataModel> mUserList;

    public class UserAdapterViewHolder extends RecyclerView.ViewHolder {
        private TextView textUserId, textUserName, textUserNIM;

        public UserAdapterViewHolder(View itemView) {
            super(itemView);
            textUserId = (TextView) itemView.findViewById(R.id.textUserId);
            textUserName = (TextView) itemView.findViewById(R.id.textUserName);
            textUserNIM = (TextView) itemView.findViewById(R.id.textUserNIM);
        }
    }

    public UserAdapter(Activity context, List<DataModel> userList) {
        this.context = context;
        mUserList = userList;
    }

    @Override
    public UserAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.schedule_list, parent, false);
        return new UserAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserAdapterViewHolder holder, int position) {
        DataModel user = mUserList.get(position);
        holder.textUserId.setText(user.getId_user());
        holder.textUserName.setText(user.getName());
        holder.textUserNIM.setText(user.getNim());
    }

    @Override
    public int getItemCount() {
        return mUserList.size();
    }
}
