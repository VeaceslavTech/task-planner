package at.webdreamsolution.taskplanner.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskList {

    private List<Task> currentTasks = new ArrayList<>();
    private List<Task> doneTasks = new ArrayList<>();


}
