package com.example.student.student_account.dashboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.student.R;

import java.util.List;

public class Adapter_midterm extends RecyclerView.Adapter<Adapter_midterm.ViewHolder> {

    private List<String> subject,date,time,room;
    LayoutInflater layoutInflater;

    public Adapter_midterm(Context context,List<String> subject, List<String> date, List<String> time, List<String> room) {
        this.layoutInflater = LayoutInflater.from(context);
        this.subject = subject;
        this.date = date;
        this.time = time;
        this.room = room;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =  layoutInflater.inflate(R.layout.custom_midterm_news,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        String txtSubject = subject.get(position);
        String txtDate = date.get(position);
        String txtTime = time.get(position);
        String txtRoom = room.get(position);

        holder.txtSubject.setText(txtSubject);
        holder.txtDate.setText(txtDate);
        holder.txtTime.setText(txtTime);
        holder.txtRoom.setText(txtRoom);

    }

    @Override
    public int getItemCount() {
        return subject.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtSubject,txtDate,txtTime,txtRoom;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtSubject = itemView.findViewById(R.id.subject_title_news);
            txtDate = itemView.findViewById(R.id.date_exam_news);
            txtTime = itemView.findViewById(R.id.time_exam_news);
            txtRoom = itemView.findViewById(R.id.room_exam_news);
        }
    }

}
