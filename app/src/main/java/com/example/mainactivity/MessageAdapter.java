package com.example.mainactivity;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.auth.FirebaseAuth;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MyViewHolder> {
    private String context;
    private List<UserModel> userModelList;
    private MessageAdapter messageModelList;
    private android.content.Context Context;


    public MessageAdapter(String context) {
        this.context = context;
        ArrayList<Object> messageModelList = new ArrayList<>();
    }

    public void add(UserModel userModel) {
        List<UserModel> messageModelList = null;
        messageModelList.add(userModel);
        notifyDataSetChanged();
    }

    public void clear() {
        messageModelList.clear();
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.message_row, parent, false);
        return new MyViewHolder(view);
    }

    @SuppressWarnings("JoinDeclarationAndAssignmentJava")
    @RequiresApi(api = Build.VERSION_CODES.TIRAMISU)
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        MessageModel messageModel = messageModelList.get(position);
        assert messageModel != null;
        holder.msg.setText(messageModel.getmessage());
        if (messageModel.getSenderId().equals(FirebaseAuth.getInstance().getUid())) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                ActivityManager.TaskDescription.Builder builder;
                builder = holder.main.setBackgroundColor(ContextCompat.getColor(Context,R.color.teal_700));

            }


        } else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                ActivityManager.TaskDescription.Builder builder;
                builder = new ActivityManager.TaskDescription.Builder();
                int color;
                color = ContextCompat.getColor(Context, R.color.black);
                builder.setBackgroundColor(Integer.parseInt(String.valueOf(color)));
            }



        }
       // holder.msg.setText(context.trim().trim(R.color.white));


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                //intent = new Intent(context, ChatActivity.class);
                UserModel userModel = null;
               // intent.putExtra("id", userModel.getUserId());
                String trim;
                Object Intent = null;
              //  trim = context.trim(null);
            }
        });

    }

    private MessageModel get(int position) {

        return null;
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public void add(Message messageModel) {

    }

    public void add(MessageModel messageModel) {

    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public BreakIterator msg;
        public ActivityManager.TaskDescription.Builder main;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
