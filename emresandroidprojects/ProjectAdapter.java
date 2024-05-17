package com.emrekin.emresandroidprojects;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder> {


    private Project[] Projects;

    public ProjectAdapter(Project[] projects) {
        Projects = projects;
    }

    @Override
    public int getItemCount() {
        return Projects.length;
    }


    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project,parent,false);
        return new ProjectViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
        holder.Bind(Projects[position]);
    }



    static class ProjectViewHolder extends RecyclerView.ViewHolder {
        ImageView appImage;
        TextView appTitle;
        TextView appDescription;

        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);
            appImage = itemView.findViewById(R.id.image_view_project_icon);
            appTitle = itemView.findViewById(R.id.title_text_view);
            appDescription = itemView.findViewById(R.id.Description_text_view);
        }

        public  void  Bind(Project project){
            appTitle.setText(project.name);
            appDescription.setText(project.description);
            appImage.setImageResource(project.image);
        }
    }

}
